package com.moosilaukecycling.dto;

import com.moosilaukecycling.domain.Bike;

public class RepairJobRequest {

    private String repair;
    private String notes;
    private Bike bike;

    public RepairJobRequest() { }

    public RepairJobRequest(String repair, String notes, Bike bike) {
        this.repair = repair;
        this.notes = notes;
        this.bike = bike;
    }

    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair;
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
}
