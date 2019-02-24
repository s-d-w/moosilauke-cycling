package com.moosilaukecycling.domain.bikeparts;

public class RacingSaddle implements Saddle {

    private String saddle;

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
}
