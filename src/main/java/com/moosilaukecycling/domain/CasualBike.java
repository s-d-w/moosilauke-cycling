package com.moosilaukecycling.domain;

public class CasualBike extends Bike {

    private String casualBikeType;

    public CasualBike(String make, String model, String size, String casualBikeType) {
        super(make, model, size);
        this.casualBikeType = casualBikeType;
    }

    private CasualBike(Builder builder) {
        super(builder);
        this.casualBikeType = builder.casualBikeType;
    }

    public static class Builder extends Bike.Builder<Builder> {

        private String casualBikeType;

        public Builder(String make, String model, String size) {
            super(make, model, size);
        }

        public Builder withCasualBikeType(String casualBikeType) {
            this.casualBikeType = casualBikeType;
            return this;
        }

        @Override
        public CasualBike build() {
            return new CasualBike(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public String getCasualBikeType() {
        return casualBikeType;
    }

    public void setCasualBikeType(String casualBikeType) {
        this.casualBikeType = casualBikeType;
    }

    @Override
    public Bike repair() {
        System.out.println("Repairing: " + make + " " + model);
        return this;
    }
}
