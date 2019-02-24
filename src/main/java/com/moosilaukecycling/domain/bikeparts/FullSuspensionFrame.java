package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("FullSuspensionFrame")
public class FullSuspensionFrame implements Frame {

    private String frame;

    public FullSuspensionFrame() { }

    public FullSuspensionFrame(String frame) {
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
