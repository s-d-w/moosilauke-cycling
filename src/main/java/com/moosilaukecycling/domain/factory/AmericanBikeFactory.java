package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.*;
import com.moosilaukecycling.domain.enums.BikeType;

public class AmericanBikeFactory extends BikeFactory {

    private BikePartFactory bikePartFactory = new AmericanBikePartFactory();

    @Override
    public Bike orderBike(BikeType bikeType) {
        Bike bike = null;
        switch (bikeType) {
            case FULL_SUSPENSION:
                bike = new FullSuspensionMountainBike(bikePartFactory);
                bike.setModel("American Full Suspension Model");
                break;
            case HARD_TAIL:
                bike = new HardTailMountainBike(bikePartFactory);
                bike.setModel("American Hard Tail Model");
                break;
            case RACING:
                bike = new RoadBike(bikePartFactory);
                bike.setModel("American Racing Model");
                break;
            case TIME_TRIAL:
                bike = new TimeTrialBike(bikePartFactory);
                bike.setModel("American Time Trial Model");
                break;
            case CASUAL:
                bike = new CasualBike(bikePartFactory);
                bike.setModel("American Casual Model");
                break;
            case ELECTRIC:
                bike = new ElectricBike(bikePartFactory);
                bike.setModel("American Electric Model");
                break;
            default:
                throw new IllegalArgumentException("Unknown bike type.");
        }
        bike.setMake("American");
        bike.setYear("2018");
        return bike;
    }
}
