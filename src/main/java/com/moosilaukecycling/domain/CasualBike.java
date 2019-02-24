package com.moosilaukecycling.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.moosilaukecycling.domain.bikeparts.*;
import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.BikePartFactory;

import static com.google.common.base.Preconditions.checkNotNull;

@JsonTypeName(value = "CasualBike")
public class CasualBike extends Bike {

    public CasualBike() { }

    public CasualBike(BikePartFactory bikePartFactory) {
        super(bikePartFactory, BikeType.CASUAL);
    }

    private CasualBike(Builder builder) {
        super(builder);
    }

    public static class Builder extends Bike.Builder<Builder> {

        public Builder(String make, String model) {
            super(make, model);
            bikeType = BikeType.CASUAL;
        }

        public Builder withCasualBikeFrame(Frame frame) {
            checkNotNull(frame, "Frame cannot be null");
            this.frame = frame;
            return this;
        }

        public Builder withCasualBikeGroupSet(GroupSet groupSet) {
            checkNotNull(groupSet, "Group Set cannot be null");
            this.groupSet = groupSet;
            return this;
        }

        public Builder withCasualBikeHandleBars(HandleBars handleBars) {
            checkNotNull(handleBars, "HandleBars cannot be null");
            this.handleBars = handleBars;
            return this;
        }

        public Builder withCasualBikeSaddle(Saddle saddle) {
            checkNotNull(saddle, "Saddle cannot be null");
            this.saddle = saddle;
            return this;
        }

        public Builder withCasualBikeWheelSet(WheelSet wheelSet) {
            checkNotNull(wheelSet, "Wheel Set cannot be null");
            this.wheelSet = wheelSet;
            return this;
        }

        @Override
        public Bike build() {
            return new CasualBike(this);
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
