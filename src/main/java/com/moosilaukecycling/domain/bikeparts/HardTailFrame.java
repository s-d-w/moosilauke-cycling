package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("HardTailFrame")
public class HardTailFrame implements Frame {

    private String frame;

    public HardTailFrame() { }

    public HardTailFrame(String frame) {
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
