package com.moosilaukecycling.domain.bikeparts;

public class MountainBikeWheelSet implements WheelSet {

    private String wheelSet;

    public MountainBikeWheelSet(String wheelSet) {
        this.wheelSet = wheelSet;
    }

    @Override
    public String getWheelSet() {
        return wheelSet;
    }

    public void setWheelSet(String wheelSet) {
        this.wheelSet = wheelSet;
    }

    @Override
    public void repair() {
        System.out.println("Repairing " + wheelSet);
    }
}
