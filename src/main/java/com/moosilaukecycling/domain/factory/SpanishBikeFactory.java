package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.*;
import com.moosilaukecycling.domain.enums.BikeType;

public class SpanishBikeFactory extends BikeFactory {

    private BikePartFactory bikePartFactory = new SpanishBikePartFactory();

    @Override
    public Bike orderBike(BikeType bikeType) {
        Bike bike = null;
        switch (bikeType) {
            case FULL_SUSPENSION:
                bike = new FullSuspensionMountainBike(bikePartFactory);
                bike.setModel("Spanish Full Suspension Model");
                break;
            case HARD_TAIL:
                bike = new HardTailMountainBike(bikePartFactory);
                bike.setModel("Spanish Hard Tail Model");
                break;
            case RACING:
                bike = new RoadBike(bikePartFactory);
                bike.setModel("Spanish Racing Model");
                break;
            case TIME_TRIAL:
                bike = new TimeTrialBike(bikePartFactory);
                bike.setModel("Spanish Time Trial Model");
                break;
            case CASUAL:
                bike = new CasualBike(bikePartFactory);
                bike.setModel("Spanish Casual Model");
                break;
            case ELECTRIC:
                bike = new ElectricBike(bikePartFactory);
                bike.setModel("Spanish Electric Model");
                break;
            default:
                throw new IllegalArgumentException("Unknown bike type.");
        }
        bike.setMake("Spanish");
        bike.setYear("2018");
        return bike;
    }
}
