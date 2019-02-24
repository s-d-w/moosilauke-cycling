package com.moosilaukecycling.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.moosilaukecycling.domain.bikeparts.*;
import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.AmericanBikePartFactory;
import com.moosilaukecycling.domain.factory.BikePartFactory;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static com.google.common.base.Preconditions.checkNotNull;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CasualBike.class, name = "CasualBike"),
        @JsonSubTypes.Type(value = ElectricBike.class, name = "ElectricBike"),
        @JsonSubTypes.Type(value = FullSuspensionMountainBike.class, name = "FullSuspensionMountainBike"),
        @JsonSubTypes.Type(value = HardTailMountainBike.class, name = "HardTailMountainBike"),
        @JsonSubTypes.Type(value = RoadBike.class, name = "RoadBike"),
        @JsonSubTypes.Type(value = TimeTrialBike.class, name = "TimeTrialBike")
})
public abstract class Bike implements Repairable {

    protected UUID id;
    protected String make;
    protected String model;
    protected String size;
    protected String year;

    protected BikeType bikeType;

    protected Frame frame;
    protected GroupSet groupSet;
    protected HandleBars handleBars;
    protected Saddle saddle;
    protected WheelSet wheelSet;

    Bike() { }

    Bike(BikePartFactory bikePartFactory, BikeType bikeType) {
        id = UUID.randomUUID();
        this.bikeType = bikeType;
        frame = bikePartFactory.createFrame(bikeType);
        groupSet = bikePartFactory.createGroupSet(bikeType);
        handleBars = bikePartFactory.createHandleBars(bikeType);
        saddle = bikePartFactory.createSaddle(bikeType);
        wheelSet = bikePartFactory.createWheelSet(bikeType);
    }

    abstract static class Builder<T extends Builder<T>> {

        UUID id;
        String make;
        String model;
        String size;
        String year;
        BikeType bikeType;

        BikePartFactory bikePartFactory;

        Frame frame;
        GroupSet groupSet;
        HandleBars handleBars;
        Saddle saddle;
        WheelSet wheelSet;

        Builder(String make, String model) {
            this.make = make;
            this.model = model;
            this.bikePartFactory = new AmericanBikePartFactory();
            this.id = UUID.randomUUID();
        }

        public T withSize(String size) {
            this.size = size;
            return self();
        }

        public T withYear(String year) {
            this.year = year;
            return self();
        }

        public T withBikePartFactory(BikePartFactory bikePartFactory) {
            checkNotNull(bikePartFactory, "BikePartFactory cannot be null.");
            this.bikePartFactory = bikePartFactory;
            return self();
        }

        abstract Bike build();

        protected abstract T self();
    }

    Bike(Builder<?> builder) {
        id = builder.id;
        make = builder.make;
        model = builder.model;
        size = builder.size;
        year = builder.year;
        bikeType = builder.bikeType;
        frame = builder.frame != null ? builder.frame : builder.bikePartFactory.createFrame(bikeType);
        groupSet = builder.groupSet != null ? builder.groupSet : builder.bikePartFactory.createGroupSet(bikeType);
        handleBars = builder.handleBars != null ? builder.handleBars : builder.bikePartFactory.createHandleBars(bikeType);
        saddle = builder.saddle != null ? builder.saddle : builder.bikePartFactory.createSaddle(bikeType);
        wheelSet = builder.wheelSet != null ? builder.wheelSet : builder.bikePartFactory.createWheelSet(bikeType);
    }

    @JsonIgnore
    public List<BikePart> getBikeParts() {
        checkNotNull(frame, "Frame cannot be null.");
        checkNotNull(saddle, "Saddle cannot be null.");
        checkNotNull(handleBars, "Handlebars cannot be null.");
        checkNotNull(wheelSet, "Wheel Set cannot be null.");
        checkNotNull(groupSet, "Group Set cannot be null.");
        return Arrays.asList(frame, saddle, handleBars, wheelSet, groupSet);
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

    public BikeType getBikeType() {
        return bikeType;
    }

    public void setBikeType(BikeType bikeType) {
        this.bikeType = bikeType;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public GroupSet getGroupSet() {
        return groupSet;
    }

    public void setGroupSet(GroupSet groupSet) {
        this.groupSet = groupSet;
    }

    public HandleBars getHandleBars() {
        return handleBars;
    }

    public void setHandleBars(HandleBars handleBars) {
        this.handleBars = handleBars;
    }

    public Saddle getSaddle() {
        return saddle;
    }

    public void setSaddle(Saddle saddle) {
        this.saddle = saddle;
    }

    public WheelSet getWheelSet() {
        return wheelSet;
    }

    public void setWheelSet(WheelSet wheelSet) {
        this.wheelSet = wheelSet;
    }
}
