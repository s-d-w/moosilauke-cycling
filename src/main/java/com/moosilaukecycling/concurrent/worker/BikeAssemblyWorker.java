package com.moosilaukecycling.concurrent.worker;

public class BikeAssemblyWorker extends Worker {

    public BikeAssemblyWorker(int id) {
        super(id);
    }

    @Override
    public void run() {
        System.out.println("Starting bike assembly job id: " + id );
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finished bike assembly job id: " + id);
    }
}
