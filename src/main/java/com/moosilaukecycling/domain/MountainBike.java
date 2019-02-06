package com.moosilaukecycling.domain;

public class MountainBike extends Bike {

    private String mountainBikeType;

    public MountainBike(String make, String model, String size, String mountainBikeType) {
        super(make, model, size);
        this.mountainBikeType = mountainBikeType;
    }

    public String getMountainBikeType() {
        return mountainBikeType;
    }

    public void setMountainBikeType(String mountainBikeType) {
        this.mountainBikeType = mountainBikeType;
    }
}
