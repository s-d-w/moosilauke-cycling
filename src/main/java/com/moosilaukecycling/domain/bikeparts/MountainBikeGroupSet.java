package com.moosilaukecycling.domain.bikeparts;

public class MountainBikeGroupSet implements GroupSet {

    private String groupSet;

    public MountainBikeGroupSet(String groupSet) {
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
