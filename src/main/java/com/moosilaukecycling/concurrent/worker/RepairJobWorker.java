package com.moosilaukecycling.concurrent.worker;

public class RepairJobWorker extends Worker {

    @Override
    public void run() {
        System.out.println("Starting repair job..");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished repair job.");

    }
}
