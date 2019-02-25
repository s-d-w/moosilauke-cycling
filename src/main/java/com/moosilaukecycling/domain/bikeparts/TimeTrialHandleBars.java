package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("TimeTrialHandleBars")
public class TimeTrialHandleBars implements HandleBars {

    private String handleBars;

    public TimeTrialHandleBars() { }

    public TimeTrialHandleBars(String handleBars) {
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
