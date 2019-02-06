package com.moosilaukecycling.domain;

public abstract class Bike {

    private String make;
    private String model;
    private String size;

    public Bike(String make, String model, String size) {
        this.make = make;
        this.model = model;
        this.size = size;
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

}
