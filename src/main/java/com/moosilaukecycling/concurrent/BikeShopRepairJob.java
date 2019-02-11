package com.moosilaukecycling.concurrent;

import com.moosilaukecycling.concurrent.worker.WorkerType;
import com.moosilaukecycling.domain.RepairJobType;

public class BikeShopRepairJob extends BikeShopJob {

    private RepairJobType repairJobType;
    private String notes;

    public BikeShopRepairJob(RepairJobType repairJobType, String notes) {
        this.workerType = WorkerType.REPAIRJOB;
        this.repairJobType = repairJobType;
        this.notes = notes;
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
}
