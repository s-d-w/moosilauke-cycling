package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.bikeparts.*;
import com.moosilaukecycling.domain.enums.BikeType;

public class AmericanBikePartFactory implements BikePartFactory {

    @Override
    public Frame createFrame(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
                return new HardTailFrame("American Hard Tail Frame");
            case FULL_SUSPENSION:
                return new FullSuspensionFrame("American Full Suspension Frame");
            case RACING:
                return new RacingFrame("American Racing Frame");
            case TIME_TRIAL:
                return new TimeTrialFrame("American Time Trial Frame");
            case CASUAL:
                return new CasualFrame("American Casual Frame");
            case ELECTRIC:
                return new ElectricFrame("American Electric Frame");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public GroupSet createGroupSet(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeGroupSet("American Mountain Bike Group Set");
            case RACING:
                return new RacingGroupSet("American Racing Group Set");
            case TIME_TRIAL:
                return new TimeTrialGroupSet("American Time Trial Group Set");
            case CASUAL:
                return new CasualGroupSet("American Casual Group Set");
            case ELECTRIC:
                return new ElectricGroupSet("American Electric Group Set");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public HandleBars createHandleBars(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeHandleBars("American Mountain Bike Handlebars");
            case RACING:
                return new RacingHandleBars("American Racing Handlebars");
            case TIME_TRIAL:
                return new TimeTrialHandleBars("American Time Trial Handlebars");
            case CASUAL:
            case ELECTRIC:
                return new CasualHandleBars("American Casual Bike Handlebars");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public Saddle createSaddle(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeSaddle("American Mountain Bike Saddle");
            case RACING:
                return new RacingSaddle("American Racing Saddle");
            case TIME_TRIAL:
                return new TimeTrialSaddle("American Time Trial Saddle");
            case CASUAL:
            case ELECTRIC:
                return new ComfortableSaddle("American Comfortable Saddle");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public WheelSet createWheelSet(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeWheelSet("American Mountain Bike Wheel Set");
            case RACING:
                return new RacingWheelSet("American Racing Wheel Set");
            case TIME_TRIAL:
                return new TimeTrialWheelSet("American Time Trial Wheel Set");
            case CASUAL:
            case ELECTRIC:
                return new CasualWheelSet("American Casual WheelSet");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }
}
