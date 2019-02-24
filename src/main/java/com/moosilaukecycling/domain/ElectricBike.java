package com.moosilaukecycling.domain;

import com.moosilaukecycling.domain.bikeparts.*;
import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.BikePartFactory;

import static com.google.common.base.Preconditions.checkNotNull;

public class ElectricBike extends Bike {

    public ElectricBike() { }

    public ElectricBike(BikePartFactory bikePartFactory) {
        super(bikePartFactory, BikeType.ELECTRIC);
    }

    private ElectricBike(Builder builder) {
        super(builder);
    }

    public static class Builder extends Bike.Builder<Builder> {

        public Builder(String make, String model) {
            super(make, model);
            bikeType = BikeType.ELECTRIC;
        }

        public Builder withElectricBikeFrame(Frame frame) {
            checkNotNull(frame, "Frame cannot be null");
            this.frame = frame;
            return this;
        }

        public Builder withElectricBikeGroupSet(GroupSet groupSet) {
            checkNotNull(groupSet, "Group Set cannot be null");
            this.groupSet = groupSet;
            return this;
        }

        public Builder withElectricBikeHandleBars(HandleBars handleBars) {
            checkNotNull(handleBars, "HandleBars cannot be null");
            this.handleBars = handleBars;
            return this;
        }

        public Builder withElectricBikeSaddle(Saddle saddle) {
            checkNotNull(saddle, "Saddle cannot be null");
            this.saddle = saddle;
            return this;
        }

        public Builder withElectricBikeWheelSet(WheelSet wheelSet) {
            checkNotNull(wheelSet, "Wheel Set cannot be null");
            this.wheelSet = wheelSet;
            return this;
        }

        @Override
        public Bike build() {
            return new ElectricBike(this);
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
