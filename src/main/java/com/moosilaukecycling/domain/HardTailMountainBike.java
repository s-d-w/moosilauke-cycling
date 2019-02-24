package com.moosilaukecycling.domain;

import com.moosilaukecycling.domain.factory.BikePartFactory;
import com.moosilaukecycling.domain.enums.BikeType;

public class HardTailMountainBike extends Bike {

    public HardTailMountainBike() { }

    public HardTailMountainBike(BikePartFactory bikePartFactory) {
        bikeType = BikeType.HARD_TAIL;
        frame = bikePartFactory.createFrame(bikeType);
        groupSet = bikePartFactory.createGroupSet(bikeType);
        handleBars = bikePartFactory.createHandleBars(bikeType);
        saddle = bikePartFactory.createSaddle(bikeType);
        wheelSet = bikePartFactory.createWheelSet(bikeType);
    }

    private HardTailMountainBike(Builder builder) {
        super(builder);
    }

    public static class Builder extends Bike.Builder<Builder> {

        public Builder(String make, String model) {
            super(make, model);
            bikeType = BikeType.HARD_TAIL;
        }

        @Override
        public Bike build() {
            return new HardTailMountainBike(this);
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
