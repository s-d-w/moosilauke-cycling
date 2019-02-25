package com.moosilaukecycling.concurrent;

import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.*;
import com.moosilaukecycling.concurrent.worker.BikeShopWorkerFactory;
import com.moosilaukecycling.concurrent.worker.Worker;
import com.moosilaukecycling.concurrent.worker.WorkerFactory;
import com.moosilaukecycling.concurrent.worker.WorkerType;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class BikeShopJobManager {

    private static final int NUMBER_OF_THREADS = 2;

    /* To avoid having the consumer thread filling up the executor's queue with many workers, we'll block
    *  it until a previous thread finishes. A callback is ran by a listenable future then releases it. */
    private static final Semaphore MAX_SUBMITTED_THREADS = new Semaphore(NUMBER_OF_THREADS);

    private static WorkerFactory workerFactory;
    private static ListeningExecutorService listeningExecutor;
    private static Map<String, WorkerType> jobClassToWorkerMap;

    public static void init() {
        listeningExecutor = MoreExecutors.listeningDecorator(new ThreadPoolExecutor(NUMBER_OF_THREADS, NUMBER_OF_THREADS,
                                                0L, TimeUnit.SECONDS, new LinkedBlockingQueue<>()));
        workerFactory = new BikeShopWorkerFactory();
        jobClassToWorkerMap = ImmutableMap.of("BikeShopAssemblyJob", WorkerType.ASSEMBLEBIKE,
                                              "BikeShopRepairJob", WorkerType.REPAIRJOB);
        startConsumer();
    }

    private static void startConsumer() {
        try {
            new Thread(consumer).start();
        } catch (Throwable e) {
            System.err.println(e);
            System.exit(1);
        }
    }

    private static final Runnable consumer = () -> {
        AtomicInteger workerId = new AtomicInteger();
        while (true) {
            try {
                MAX_SUBMITTED_THREADS.acquire();
                Optional<BikeShopJob> jobOptional = BikeShopJobQueue.getJob();
                if (jobOptional.isPresent()) {
                    WorkerType workerType = jobClassToWorkerMap.get(getSimpleClassName(jobOptional.get().getClazz()));
                    if (workerType == null) {
                        throw new RuntimeException("Unknown Job class to WorkerType mapping.");
                    }
                    Worker worker = workerFactory.createWorker(
                            workerType, workerId.getAndIncrement(), jobOptional.get().getPayload());
                    ListenableFuture<?> future = listeningExecutor.submit(worker);
                    Futures.addCallback(future, releasePermit(), MoreExecutors.directExecutor());
                } else {
                    MAX_SUBMITTED_THREADS.release();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    };

    private static String getSimpleClassName(String className) {
        return className.substring(className.lastIndexOf('.') + 1);
    }

    private static FutureCallback releasePermit() {
        return new FutureCallback() {

            @Override
            public void onSuccess(@Nullable Object result) {
                MAX_SUBMITTED_THREADS.release();
            }

            @Override
            public void onFailure(Throwable t) {
                System.err.println(t);
                MAX_SUBMITTED_THREADS.release();
            }
        };
    }
}
