package com.moosilaukecycling.domain;

import java.util.UUID;

public abstract class Bike implements Repairable<Bike> {

    protected UUID id;
    protected String make;
    protected String model;
    protected String size;
    protected String year;

    Bike(String make, String model, String size) {
        this.make = make;
        this.model = model;
        this.size = size;
    }

    abstract static class Builder<T extends Builder<T>> {

        UUID id;
        String make;
        String model;
        String size;
        String year;

        Builder(String make, String model, String size) {
            this.make = make;
            this.model = model;
            this.size = size;
            this.id = UUID.randomUUID();
        }

        public T withYear(String year) {
            this.year = year;
            return self();
        }

        abstract Bike build();

        protected abstract T self();
    }

    Bike(Builder<?> builder) {
        this.id = builder.id;
        this.make = builder.make;
        this.model = builder.model;
        this.size = builder.size;
        this.year = builder.year;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
