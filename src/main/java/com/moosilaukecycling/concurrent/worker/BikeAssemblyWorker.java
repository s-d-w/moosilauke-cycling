package com.moosilaukecycling.concurrent.worker;

import com.moosilaukecycling.domain.Assemblable;
import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.exception.BikeShopJsonProcessingException;
import com.moosilaukecycling.util.JsonUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BikeAssemblyWorker extends Worker {

    private Assemblable assemblable;

    public BikeAssemblyWorker(int id, byte[] payload) {
        super(id);
        deserializePayload(payload);
    }

    @Override
    public void run() {
        System.out.println("Starting bike assembly job id: " + id );
        try {
            assemblable.assemble();
            Thread.sleep(1000L);
            System.out.println("Cleaning up for bike assembly job id: " + id );
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finished bike assembly job id: " + id);
    }

    private void deserializePayload(byte[] payload) {
        try {
            assemblable = JsonUtil.fromJsonString(new String(payload, StandardCharsets.UTF_8), Bike.class);
        } catch (IOException e) {
            throw new BikeShopJsonProcessingException(e);
        }
    }
}
