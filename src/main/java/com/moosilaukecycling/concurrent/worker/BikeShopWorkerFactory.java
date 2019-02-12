package com.moosilaukecycling.concurrent.worker;

public class BikeShopWorkerFactory extends WorkerFactory {

    @Override
    public Worker createWorker(WorkerType workerType, int id) {
        switch (workerType) {
            case REPAIRJOB:
                return new RepairJobWorker(id);
            case ASSEMBLEBIKE:
                return new BikeAssemblyWorker(id);
            default:
                throw new IllegalArgumentException("Unknown worker type: " + workerType.toString());
        }
    }
}
