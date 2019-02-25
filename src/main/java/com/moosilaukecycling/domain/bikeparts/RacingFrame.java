package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("RacingFrame")
public class RacingFrame implements Frame {

    private String frame;

    public RacingFrame() { }

    public RacingFrame(String frame) {
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

    @Override
    public void assemble() {
        System.out.println("Assembling " + frame);
    }
}
