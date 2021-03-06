package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "RacingGroupSet")
public class RacingGroupSet implements GroupSet {

    private String groupSet;

    public RacingGroupSet() { }

    public RacingGroupSet(String groupSet) {
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

    @Override
    public void assemble() {
        System.out.println("Assembling " + groupSet);
    }
}
