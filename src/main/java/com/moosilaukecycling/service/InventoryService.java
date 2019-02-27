package com.moosilaukecycling.service;

import com.moosilaukecycling.concurrent.job.BikeShopAssemblyJob;
import com.moosilaukecycling.concurrent.BikeShopJobQueue;
import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.domain.enums.BikeCountry;
import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.BikeCatalog;
import com.moosilaukecycling.dto.CreateBikeRequest;

public class InventoryService {

    public InventoryService() { }

    public void addInventoryItem(CreateBikeRequest request) {
        BikeCountry country = BikeCountry.valueOf(request.getBikeCountry());
        BikeType type = BikeType.valueOf(request.getBikeType());
        Bike bike = BikeCatalog.orderBike(country, type);
        BikeShopAssemblyJob job = new BikeShopAssemblyJob(bike);
        BikeShopJobQueue.submitJob(job);
    }
}
