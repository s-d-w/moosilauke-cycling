package com.moosilaukecycling.concurrent.worker;

public class RepairJobWorker extends Worker {

    public RepairJobWorker(int id) {
        super(id);
    }

    @Override
    public void run() {
        System.out.println("Starting repair job id: " + id );
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finished repair job id: " + id);
    }
}
