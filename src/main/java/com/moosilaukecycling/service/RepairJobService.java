package com.moosilaukecycling.service;

import com.moosilaukecycling.concurrent.BikeShopJob;
import com.moosilaukecycling.concurrent.BikeShopJobQueue;
import com.moosilaukecycling.concurrent.BikeShopRepairJob;
import com.moosilaukecycling.domain.RepairJobType;
import com.moosilaukecycling.dto.RepairJobRequest;

public class RepairJobService {

    public RepairJobService() { }

    public void createRepairJob(RepairJobRequest repairJobRequest) {
        RepairJobType repairJobType = RepairJobType.valueOf(repairJobRequest.getRepair());
        BikeShopJob job = new BikeShopRepairJob(repairJobType, repairJobRequest.getNotes());
        BikeShopJobQueue.submitJob(job);
    }

}