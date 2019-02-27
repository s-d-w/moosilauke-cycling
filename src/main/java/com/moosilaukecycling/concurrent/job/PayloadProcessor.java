package com.moosilaukecycling.concurrent.job;

public interface PayloadProcessor {

    void serialize();

    void deserialize();
}
