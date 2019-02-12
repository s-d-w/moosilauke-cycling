package com.moosilaukecycling.factory;

import com.moosilaukecycling.domain.Bike;

public abstract class BikeFactory {

    public abstract Bike createBike(String make, String model, String size);
}
