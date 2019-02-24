package com.moosilaukecycling.domain;

import com.moosilaukecycling.domain.bikeparts.GroupSet;
import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.BikePartFactory;

import static com.google.common.base.Preconditions.checkNotNull;

public class RoadBike extends Bike {

    public RoadBike() { }

    public RoadBike(BikePartFactory bikePartFactory) {
        bikeType = BikeType.RACING;
        frame = bikePartFactory.createFrame(bikeType);
        groupSet = bikePartFactory.createGroupSet(bikeType);
        handleBars = bikePartFactory.createHandleBars(bikeType);
        saddle = bikePartFactory.createSaddle(bikeType);
        wheelSet = bikePartFactory.createWheelSet(bikeType);
    }

    private RoadBike(Builder builder) {
        super(builder);
        this.groupSet = builder.groupSet;
    }

    public static class Builder extends Bike.Builder<Builder> {

        GroupSet groupSet;

        public Builder(String make, String model) {
            super(make, model);
            bikeType = BikeType.RACING;
        }

        public Builder withRacingGroupSet(GroupSet groupSet) {
            checkNotNull(groupSet, "Group Set cannot be null");
            this.groupSet = groupSet;
            return this;
        }

        @Override
        public Bike build() {
            return new RoadBike(this);
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
