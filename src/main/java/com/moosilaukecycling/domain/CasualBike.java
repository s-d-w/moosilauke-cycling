package com.moosilaukecycling.domain;

public class CasualBike extends Bike {

    private String casualBikeType;

    public CasualBike(String make, String model, String size, String casualBikeType) {
        super(make, model, size);
        this.casualBikeType = casualBikeType;
    }

    public String getCasualBikeType() {
        return casualBikeType;
    }

    public void setCasualBikeType(String casualBikeType) {
        this.casualBikeType = casualBikeType;
    }
}
