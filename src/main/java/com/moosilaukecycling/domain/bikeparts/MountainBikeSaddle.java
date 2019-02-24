package com.moosilaukecycling.domain.bikeparts;

public class MountainBikeSaddle implements Saddle {

    private String saddle;

    public MountainBikeSaddle(String saddle) {
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
