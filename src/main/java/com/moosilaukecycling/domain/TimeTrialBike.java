package com.moosilaukecycling.domain;

import com.moosilaukecycling.domain.bikeparts.WheelSet;
import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.BikePartFactory;

import static com.google.common.base.Preconditions.checkNotNull;

public class TimeTrialBike extends Bike {

    public TimeTrialBike() { }

    public TimeTrialBike(BikePartFactory bikePartFactory) {
        bikeType = BikeType.TIME_TRIAL;
        frame = bikePartFactory.createFrame(bikeType);
        groupSet = bikePartFactory.createGroupSet(bikeType);
        handleBars = bikePartFactory.createHandleBars(bikeType);
        saddle = bikePartFactory.createSaddle(bikeType);
        wheelSet = bikePartFactory.createWheelSet(bikeType);
    }

    private TimeTrialBike(Builder builder) {
        super(builder);
        this.wheelSet = builder.wheelSet;
    }

    public static class Builder extends Bike.Builder<Builder> {

        WheelSet wheelSet;

        public Builder(String make, String model) {
            super(make, model);
            bikeType = BikeType.TIME_TRIAL;
        }

        public Builder withTimeTrialWheelSet(WheelSet wheelSet) {
            checkNotNull(wheelSet, "Wheel Set cannot be null");
            this.wheelSet = wheelSet;
            return this;
        }

        @Override
        public Bike build() {
            return new TimeTrialBike(this);
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
