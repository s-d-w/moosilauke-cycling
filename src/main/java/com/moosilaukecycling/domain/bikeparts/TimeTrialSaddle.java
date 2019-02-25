package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("TimeTrialSaddle")
public class TimeTrialSaddle implements Saddle {

    private String saddle;

    public TimeTrialSaddle() { }

    public TimeTrialSaddle(String saddle) {
        this.saddle = saddle;
    }

    @Override
    public String getSaddle() {
        return saddle;
    }

    public void setSaddle(String saddle) {
        this.saddle = saddle;
    }

    @Override
    public void repair() {
        System.out.println("Repairing " + saddle);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling " + saddle);
    }
}
