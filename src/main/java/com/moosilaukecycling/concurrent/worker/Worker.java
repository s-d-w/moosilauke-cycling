package com.moosilaukecycling.concurrent.worker;

public abstract class Worker implements Runnable {

    protected final int id;

    public Worker(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    protected abstract void deserializePayload(byte[] payload);

}
