package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "MountainBikeWheelSet")
public class MountainBikeWheelSet implements WheelSet {

    private String wheelSet;

    public MountainBikeWheelSet() { }

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

    @Override
    public void assemble() {
        System.out.println("Assembling " + wheelSet);
    }
}
