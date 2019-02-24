package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("ComfortableSaddle")
public class ComfortableSaddle implements Saddle {

    private String saddle;

    public ComfortableSaddle() { }

    public ComfortableSaddle(String saddle) {
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
}
