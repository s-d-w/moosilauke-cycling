package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "RacingWheelSet")
public class RacingWheelSet implements WheelSet {

    private String wheelSet;

    public RacingWheelSet() { }

    public RacingWheelSet(String wheelSet) {
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
