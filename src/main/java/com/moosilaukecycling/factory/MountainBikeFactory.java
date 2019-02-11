package com.moosilaukecycling.factory;

import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.domain.MountainBike;

public class MountainBikeFactory extends BikeFactory {

    @Override
    public Bike createBike(String make, String model, String size) {
        return new MountainBike(make, model, size, "hardtail");
    }
}
