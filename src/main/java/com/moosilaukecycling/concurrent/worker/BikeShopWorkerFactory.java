package com.moosilaukecycling.concurrent.worker;

public class BikeShopWorkerFactory extends WorkerFactory {

    @Override
    public Worker createWorker(WorkerType workerType, int id, byte[] payload) {
        switch (workerType) {
            case REPAIRJOB:
                return new RepairJobWorker(id, payload);
            case ASSEMBLEBIKE:
                return new BikeAssemblyWorker(id, payload);
            default:
                throw new IllegalArgumentException("Unknown worker type: " + workerType.toString());
        }
    }
}
