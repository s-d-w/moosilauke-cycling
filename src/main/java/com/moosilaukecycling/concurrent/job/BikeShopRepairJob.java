package com.moosilaukecycling.concurrent.job;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.domain.RepairJobType;
import com.moosilaukecycling.exception.BikeShopJsonProcessingException;
import com.moosilaukecycling.util.JsonUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BikeShopRepairJob implements BikeShopJob {

    private RepairJobType repairJobType;
    private String notes;
    private Bike bike;

    public BikeShopRepairJob() { }

    public BikeShopRepairJob(byte[] payload) {
        try {
            bike = JsonUtil.fromJsonString(new String(payload, StandardCharsets.UTF_8), Bike.class);
        } catch (IOException e) {
            throw new BikeShopJsonProcessingException(e);
        }
    }

    public BikeShopRepairJob(RepairJobType repairJobType, String notes, Bike bike) {
        this.repairJobType = repairJobType;
        this.notes = notes;
        this.bike = bike;
    }

    public RepairJobType getRepairJobType() {
        return repairJobType;
    }

    public void setRepairJobType(RepairJobType repairJobType) {
        this.repairJobType = repairJobType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String getClazz() {
        return this.getClass().getName();
    }

    @Override
    public byte[] getPayload() {
        try {
            String json = JsonUtil.toJsonString(bike);
            return json.getBytes(StandardCharsets.UTF_8);
        } catch (JsonProcessingException e) {
            throw new BikeShopJsonProcessingException(e);
        }
    }
}
