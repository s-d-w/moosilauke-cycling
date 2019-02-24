package com.moosilaukecycling.domain.bikeparts;

public class TimeTrialFrame implements Frame {

    private String frame;

    public TimeTrialFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public void repair() {
        System.out.println("Repairing " + frame);
    }
}
