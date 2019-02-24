package com.moosilaukecycling.domain;

import com.moosilaukecycling.domain.bikeparts.*;
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
    }

    public static class Builder extends Bike.Builder<Builder> {

        public Builder(String make, String model) {
            super(make, model);
            bikeType = BikeType.TIME_TRIAL;
        }

        public Builder withTimeTrialFrame(Frame frame) {
            checkNotNull(frame, "Frame cannot be null");
            this.frame = frame;
            return this;
        }

        public Builder withTimeTrialGroupSet(GroupSet groupSet) {
            checkNotNull(groupSet, "Group Set cannot be null");
            this.groupSet = groupSet;
            return this;
        }

        public Builder withTimeTrialHandleBars(HandleBars handleBars) {
            checkNotNull(handleBars, "HandleBars cannot be null");
            this.handleBars = handleBars;
            return this;
        }

        public Builder withTimeTrialSaddle(Saddle saddle) {
            checkNotNull(saddle, "Saddle cannot be null");
            this.saddle = saddle;
            return this;
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
