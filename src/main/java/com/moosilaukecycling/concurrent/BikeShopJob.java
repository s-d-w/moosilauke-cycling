package com.moosilaukecycling.concurrent;

import com.moosilaukecycling.concurrent.worker.WorkerType;

public abstract class BikeShopJob {

    protected WorkerType workerType;

    public BikeShopJob() { }

    public WorkerType getWorkerType() {
        return workerType;
    }

}
