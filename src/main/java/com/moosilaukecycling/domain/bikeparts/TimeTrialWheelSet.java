package com.moosilaukecycling.domain.bikeparts;

public class TimeTrialWheelSet implements WheelSet {

    private String wheelSet;

    public TimeTrialWheelSet(String wheelSet) {
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
