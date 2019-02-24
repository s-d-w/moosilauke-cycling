package com.moosilaukecycling.domain.bikeparts;

public class TimeTrialSaddle implements Saddle {

    private String saddle;

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
}
