package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("CasualHandleBars")
public class CasualHandleBars implements HandleBars {

    private String handleBars;

    public CasualHandleBars() { }

    public CasualHandleBars(String handleBars) {
        this.handleBars = handleBars;
    }

    @Override
    public String getHandleBars() {
        return handleBars;
    }

    public void setHandleBars(String handleBars) {
        this.handleBars = handleBars;
    }

    @Override
    public void repair() {
        System.out.println("Repairing " + handleBars);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + handleBars);
    }
}
