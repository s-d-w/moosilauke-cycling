package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "TimeTrialFrame")
public class TimeTrialFrame implements Frame {

    private String frame;

    public TimeTrialFrame() { }

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
