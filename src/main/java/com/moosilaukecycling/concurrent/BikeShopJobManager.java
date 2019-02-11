package com.moosilaukecycling.concurrent;

import com.moosilaukecycling.concurrent.worker.BikeShopWorkerFactory;
import com.moosilaukecycling.concurrent.worker.Worker;
import com.moosilaukecycling.concurrent.worker.WorkerFactory;

import java.util.Optional;
import java.util.concurrent.*;

public class BikeShopJobManager {

    private static final int NUMBER_OF_THREADS = 2;
    private static final long CHECK_EVERY = 1000;
    private static final long WAIT_FOR = 5000;

    private static ThreadPoolExecutor threadPoolExecutor;
    private static WorkerFactory workerFactory;

    public static void init() {
        // at most there will be three pulled off the queue, with two running and one in the executor's queue
        threadPoolExecutor = new ThreadPoolExecutor(NUMBER_OF_THREADS, NUMBER_OF_THREADS,
                                        0L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(1));
        workerFactory = new BikeShopWorkerFactory();
        startConsumer();
    }

    private static void startConsumer() {
        try {
            new Thread(consumer).start();
        } catch (Throwable e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }

    private static final Runnable consumer = () -> {
        while (true) {
            Optional<BikeShopJob> jobOptional = BikeShopJobQueue.getJob();
            if (jobOptional.isPresent()) {
                Worker worker = workerFactory.createWorker(jobOptional.get().getWorkerType());
                try {
                    threadPoolExecutor.submit(worker);
                } catch (RejectedExecutionException e) {
                    BikeShopJobQueue.returnJob(jobOptional.get());
                    rest(WAIT_FOR);
                }
            } else {
                rest(CHECK_EVERY);
            }
        }
    };

    private static void rest(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
