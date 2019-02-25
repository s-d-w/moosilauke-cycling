package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("RacingHandleBars")
public class RacingHandleBars implements HandleBars {

    private String handleBars;

    public RacingHandleBars() { }

    public RacingHandleBars(String handleBars) {
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
