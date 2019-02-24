package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.domain.enums.BikeType;

public abstract class BikeFactory {

    public abstract Bike orderBike(BikeType bikeType);
}
