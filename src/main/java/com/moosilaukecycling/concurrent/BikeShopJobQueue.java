package com.moosilaukecycling.concurrent;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class BikeShopJobQueue {

    private static final JobQueue jobQueue = new JobQueue();

    private BikeShopJobQueue() { }

    public static void submitJob(BikeShopJob job) {
        try {
            jobQueue.submit(new Job(job.getClazz(), job.getPayload()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Optional<BikeShopJob> getJob() {
        try {
            Job job = jobQueue.getJob();
            if (job != null) {
                Class clazz = Class.forName(job.getClazz());
                Constructor<?> constructor = clazz.getConstructor(new Class[] { byte[].class});
                return Optional.of((BikeShopJob)constructor.newInstance(job.getPayload()));
            }
            return Optional.empty();
        } catch (IOException | ClassNotFoundException | NoSuchMethodException |
                InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public void returnJob(BikeShopJob job) {
        try {
            jobQueue.returnJob(new Job(job.getClazz(), job.getPayload()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
