package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.*;
import com.moosilaukecycling.domain.enums.BikeType;

public class FrenchBikeFactory extends BikeFactory {

    private BikePartFactory bikePartFactory = new FrenchBikePartFactory();

    @Override
    public Bike orderBike(BikeType bikeType) {
        Bike bike = null;
        switch (bikeType) {
            case FULL_SUSPENSION:
                bike = new FullSuspensionMountainBike(bikePartFactory);
                bike.setModel("French Full Suspension Model");
                break;
            case HARD_TAIL:
                bike = new HardTailMountainBike(bikePartFactory);
                bike.setModel("French Hard Tail Model");
                break;
            case RACING:
                bike = new RoadBike(bikePartFactory);
                bike.setModel("French Racing Model");
                break;
            case TIME_TRIAL:
                bike = new TimeTrialBike(bikePartFactory);
                bike.setModel("French Time Trial Model");
                break;
            case CASUAL:
                bike = new CasualBike(bikePartFactory);
                bike.setModel("French Casual Model");
                break;
            case ELECTRIC:
                bike = new ElectricBike(bikePartFactory);
                bike.setModel("French Electric Model");
                break;
            default:
                throw new IllegalArgumentException("Unknown bike type.");
        }
        bike.setMake("French");
        bike.setYear("2018");
        return bike;
    }
}
