package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("RacingSaddle")
public class RacingSaddle implements Saddle {

    private String saddle;

    public RacingSaddle() { }

    public RacingSaddle(String saddle) {
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
