package com.moosilaukecycling.concurrent;

import com.moosilaukecycling.concurrent.worker.WorkerType;

import java.io.Serializable;

public abstract class BikeShopJob implements Serializable {

    protected WorkerType workerType;

    public BikeShopJob() { }

    public WorkerType getWorkerType() {
        return workerType;
    }

}
