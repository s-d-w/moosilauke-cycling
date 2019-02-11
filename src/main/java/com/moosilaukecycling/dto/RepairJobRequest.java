package com.moosilaukecycling.dto;

public class RepairJobRequest {

    private String repair;
    private String notes;

    public RepairJobRequest() { }

    public RepairJobRequest(String repair, String notes) {
        this.repair = repair;
        this.notes = notes;
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

}
