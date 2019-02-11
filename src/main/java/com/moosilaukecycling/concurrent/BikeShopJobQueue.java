package com.moosilaukecycling.concurrent;

import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;

public class BikeShopJobQueue {

    private BikeShopJobQueue() { }

    private static final Deque<BikeShopJob> deque = new ConcurrentLinkedDeque<>();

    public static boolean submitJob(BikeShopJob job) {
        return deque.add(job);
    }

    public static List<BikeShopJob> getJobs(int amount) {
       throw new UnsupportedOperationException();
    }

    public static Optional<BikeShopJob> getJob() {
        return Optional.ofNullable(deque.poll());
    }

    public static void returnJob(BikeShopJob job) {
        deque.addFirst(job);
    }

}
