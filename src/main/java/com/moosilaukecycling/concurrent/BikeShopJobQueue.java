package com.moosilaukecycling.concurrent;

import java.io.IOException;
import java.util.Optional;

public class BikeShopJobQueue {

    private static final MessageQueue<BikeShopJob> queue = new MessageQueue<>();

    private BikeShopJobQueue() { }

    public static void submitJob(BikeShopJob job) {
        try {
            queue.submit(job);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Optional<BikeShopJob> getJob() {
        try {
            return Optional.ofNullable(queue.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void returnJob(BikeShopJob job) {
        try {
            queue.returnMessage(job);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
