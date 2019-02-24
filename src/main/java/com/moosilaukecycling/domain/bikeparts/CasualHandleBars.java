package com.moosilaukecycling.domain.bikeparts;

public class CasualHandleBars implements HandleBars {

    private String handleBars;

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
}