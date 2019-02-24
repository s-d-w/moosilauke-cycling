package com.moosilaukecycling.domain.bikeparts;

public class ElectricGroupSet implements GroupSet {

    private String groupSet;

    public ElectricGroupSet(String groupSet) {
        this.groupSet = groupSet;
    }

    @Override
    public String getGroupSet() {
        return groupSet;
    }

    public void setGroupSet(String groupSet) {
        this.groupSet = groupSet;
    }

    @Override
    public void repair() {
        System.out.println("Repairing " + groupSet);
    }
}
