package com.moosilaukecycling.concurrent.job;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.moosilaukecycling.domain.Assemblable;
import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.exception.BikeShopJsonProcessingException;
import com.moosilaukecycling.util.JsonUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BikeShopAssemblyJob implements BikeShopJob {

    private Assemblable assemblable;

    public BikeShopAssemblyJob() { }

    public BikeShopAssemblyJob(byte[] payload) {
        try {
            assemblable = JsonUtil.fromJsonString(new String(payload, StandardCharsets.UTF_8), Bike.class);
        } catch (IOException e) {
            throw new BikeShopJsonProcessingException(e);
        }
    }

    public BikeShopAssemblyJob(Assemblable assemblable) {
        this.assemblable = assemblable;
    }

    @Override
    public String getClazz() {
        return this.getClass().getName();
    }

    @Override
    public byte[] getPayload() {
        try {
            String json = JsonUtil.toJsonString(assemblable);
            return json.getBytes(StandardCharsets.UTF_8);
        } catch (JsonProcessingException e) {
            throw new BikeShopJsonProcessingException(e);
        }
    }
}
