package com.moosilaukecycling.concurrent.worker;

import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.domain.Repairable;
import com.moosilaukecycling.exception.BikeShopJsonProcessingException;
import com.moosilaukecycling.util.JsonUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class RepairJobWorker extends Worker {

    private Repairable repairable;

    public RepairJobWorker(int id, byte[] payload) {
        super(id);
        deserializePayload(payload);
    }

    @Override
    public void run() {
        System.out.println("Starting repair job id: " + id );
        try {
            repairable.repair();
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finished repair job id: " + id);
    }

    private void deserializePayload(byte[] payload) {
        try {
            repairable = JsonUtil.fromJsonString(new String(payload, StandardCharsets.UTF_8), Bike.class);
        } catch (IOException e) {
            throw new BikeShopJsonProcessingException(e);
        }
    }
}
