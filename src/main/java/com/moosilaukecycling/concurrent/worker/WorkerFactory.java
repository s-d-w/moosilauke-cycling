package com.moosilaukecycling.concurrent.worker;

public abstract class WorkerFactory {

    public abstract Worker createWorker(WorkerType workerType, int id);
}
