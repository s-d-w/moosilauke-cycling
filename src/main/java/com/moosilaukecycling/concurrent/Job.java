package com.moosilaukecycling.concurrent;

import java.io.Serializable;

public class Job implements Serializable {

    private static final long serialVersionUID = 1L;

    private String clazz;

    private byte[] payload;

    public Job() { }

    public Job(String clazz, byte[] payload) {
        this.clazz = clazz;
        this.payload = payload;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public byte[] getPayload() {
        return payload;
    }

    public void setPayload(byte[] payload) {
        this.payload = payload;
    }
}
