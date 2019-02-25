package com.moosilaukecycling.domain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.moosilaukecycling.domain.bikeparts.*;
import com.moosilaukecycling.domain.factory.BikePartFactory;
import com.moosilaukecycling.domain.enums.BikeType;

import static com.google.common.base.Preconditions.checkNotNull;

@JsonTypeName(value = "HardTailMountainBike")
public class HardTailMountainBike extends Bike {

    public HardTailMountainBike() { }

    public HardTailMountainBike(BikePartFactory bikePartFactory) {
        super(bikePartFactory, BikeType.HARD_TAIL);
    }

    private HardTailMountainBike(Builder builder) {
        super(builder);
    }

    public static class Builder extends Bike.Builder<Builder> {

        public Builder(String make, String model) {
            super(make, model);
            bikeType = BikeType.HARD_TAIL;
        }

        public Builder withHardTailMountainBikeFrame(Frame frame) {
            checkNotNull(frame, "Frame cannot be null");
            this.frame = frame;
            return this;
        }

        public Builder withHardTailMountainBikeGroupSet(GroupSet groupSet) {
            checkNotNull(groupSet, "Group Set cannot be null");
            this.groupSet = groupSet;
            return this;
        }

        public Builder withHardTailMountainBikeHandleBars(HandleBars handleBars) {
            checkNotNull(handleBars, "HandleBars cannot be null");
            this.handleBars = handleBars;
            return this;
        }

        public Builder withHardTailMountainBikeSaddle(Saddle saddle) {
            checkNotNull(saddle, "Saddle cannot be null");
            this.saddle = saddle;
            return this;
        }

        public Builder withHardTailMountainBikeWheelSet(WheelSet wheelSet) {
            checkNotNull(wheelSet, "Wheel Set cannot be null");
            this.wheelSet = wheelSet;
            return this;
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

    @Override
    public void assemble() {
        getBikeParts().forEach(Assemblable::assemble);
    }
}
