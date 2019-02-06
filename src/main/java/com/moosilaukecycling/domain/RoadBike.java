package com.moosilaukecycling.domain;

public class RoadBike extends Bike {

    private String roadBikeType;

    public RoadBike(String make, String model, String size, String roadBikeType) {
        super(make, model, size);
        this.roadBikeType = roadBikeType;
    }

    public String getRoadBikeType() {
        return roadBikeType;
    }

    public void setRoadBikeType(String roadBikeType) {
        this.roadBikeType = roadBikeType;
    }

}
