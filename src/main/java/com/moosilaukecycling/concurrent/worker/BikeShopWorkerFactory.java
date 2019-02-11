package com.moosilaukecycling.concurrent.worker;

public class BikeShopWorkerFactory extends WorkerFactory {

    @Override
    public Worker createWorker(WorkerType workerType) {
        switch (workerType) {
            case REPAIRJOB:
                return new RepairJobWorker();
            case ASSEMBLEBIKE:
                return new BikeAssemblyWorker();
            default:
                throw new IllegalArgumentException("Unknown worker type: " + workerType.toString());
        }
    }
}
