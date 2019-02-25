package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "ElectricGroupSet")
public class ElectricGroupSet implements GroupSet {

    private String groupSet;

    public ElectricGroupSet() { }

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

    @Override
    public void assemble() {
        System.out.println("Assembling " + groupSet);
    }
}
