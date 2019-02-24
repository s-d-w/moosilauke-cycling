package com.moosilaukecycling.domain.bikeparts;

public class TimeTrialHandleBars implements HandleBars {

    private String handleBars;

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
}
