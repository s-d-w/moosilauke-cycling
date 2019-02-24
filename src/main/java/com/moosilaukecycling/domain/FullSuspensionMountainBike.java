package com.moosilaukecycling.domain;

import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.BikePartFactory;

public class FullSuspensionMountainBike extends Bike {

    public FullSuspensionMountainBike() { }

    public FullSuspensionMountainBike(BikePartFactory bikePartFactory) {
        bikeType = BikeType.FULL_SUSPENSION;
        frame = bikePartFactory.createFrame(bikeType);
        groupSet = bikePartFactory.createGroupSet(bikeType);
        handleBars = bikePartFactory.createHandleBars(bikeType);
        saddle = bikePartFactory.createSaddle(bikeType);
        wheelSet = bikePartFactory.createWheelSet(bikeType);
    }

    private FullSuspensionMountainBike(Builder builder) {
        super(builder);
    }

    public static class Builder extends Bike.Builder<Builder> {

        public Builder(String make, String model) {
            super(make, model);
            bikeType = BikeType.FULL_SUSPENSION;
        }

        @Override
        public Bike build() {
            return new FullSuspensionMountainBike(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public void repair() {
        getBikeParts().forEach(Repairable::repair);
    }
}
