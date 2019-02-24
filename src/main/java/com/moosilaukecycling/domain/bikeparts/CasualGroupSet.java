package com.moosilaukecycling.domain.bikeparts;

public class CasualGroupSet implements GroupSet {

    private String groupSet;

    public CasualGroupSet(String groupSet) {
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
