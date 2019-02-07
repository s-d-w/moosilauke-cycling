package com.moosilaukecycling.domain;

public class MountainBike extends Bike {

    private String mountainBikeType;

    public MountainBike(String make, String model, String size, String mountainBikeType) {
        super(make, model, size);
        this.mountainBikeType = mountainBikeType;
    }

    private MountainBike(Builder builder) {
        super(builder);
        this.mountainBikeType = builder.mountainBikeType;
    }

    public static class Builder extends Bike.Builder<Builder> {

        private String mountainBikeType;

        public Builder(String make, String model, String size) {
            super(make, model, size);
        }

        public Builder withMountainBikeType(String mountainBikeType) {
            this.mountainBikeType = mountainBikeType;
            return this;
        }

        @Override
        public MountainBike build() {
            return new MountainBike(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public String getMountainBikeType() {
        return mountainBikeType;
    }

    public void setMountainBikeType(String mountainBikeType) {
        this.mountainBikeType = mountainBikeType;
    }

    @Override
    public Bike repair() {
        System.out.println("Repairing: " + make + " " + model);
        return this;
    }
}
