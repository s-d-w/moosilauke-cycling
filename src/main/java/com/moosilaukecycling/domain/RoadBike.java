package com.moosilaukecycling.domain;

public class RoadBike extends Bike {

    private String roadBikeType;

    public RoadBike(String make, String model, String size, String roadBikeType) {
        super(make, model, size);
        this.roadBikeType = roadBikeType;
    }

    private RoadBike(Builder builder) {
        super(builder);
        this.roadBikeType = builder.roadBikeType;
    }

    public static class Builder extends Bike.Builder<Builder> {

        private String roadBikeType;

        public Builder(String make, String model, String size) {
            super(make, model, size);
        }

        public Builder withRoadBikeType(String roadBikeType) {
            this.roadBikeType = roadBikeType;
            return this;
        }

        @Override
        public RoadBike build() {
            return new RoadBike(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public String getRoadBikeType() {
        return roadBikeType;
    }

    public void setRoadBikeType(String roadBikeType) {
        this.roadBikeType = roadBikeType;
    }

    @Override
    public Bike repair() {
        System.out.println("Repairing: " + make + " " + model);
        return this;
    }
}
