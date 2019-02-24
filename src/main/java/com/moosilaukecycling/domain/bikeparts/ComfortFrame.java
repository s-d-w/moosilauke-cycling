package com.moosilaukecycling.domain.bikeparts;

public class ComfortFrame implements Frame {

    private String frame;

    public ComfortFrame(String frame) {
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
