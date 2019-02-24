package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.*;
import com.moosilaukecycling.domain.enums.BikeType;

public class ItalianBikeFactory extends BikeFactory {

    private BikePartFactory bikePartFactory = new ItalianBikePartFactory();

    @Override
    public Bike orderBike(BikeType bikeType) {
        Bike bike = null;
        switch (bikeType) {
            case FULL_SUSPENSION:
                bike = new FullSuspensionMountainBike(bikePartFactory);
                bike.setModel("Italian Full Suspension Model");
                break;
            case HARD_TAIL:
                bike = new HardTailMountainBike(bikePartFactory);
                bike.setModel("Italian Hard Tail Model");
                break;
            case RACING:
                bike = new RoadBike(bikePartFactory);
                bike.setModel("Italian Racing Model");
                break;
            case TIME_TRIAL:
                bike = new TimeTrialBike(bikePartFactory);
                bike.setModel("Italian Time Trial Model");
                break;
            case CASUAL:
                bike = new CasualBike(bikePartFactory);
                bike.setModel("Italian Casual Model");
                break;
            case ELECTRIC:
                bike = new ElectricBike(bikePartFactory);
                bike.setModel("Italian Electric Model");
                break;
            default:
                throw new IllegalArgumentException("Unknown bike type.");
        }
        bike.setMake("Italian");
        bike.setYear("2018");
        return bike;
    }
}
