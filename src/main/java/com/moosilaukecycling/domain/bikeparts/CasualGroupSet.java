package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "CasualGroupSet")
public class CasualGroupSet implements GroupSet {

    private String groupSet;

    public CasualGroupSet() { }

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
