package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.bikeparts.*;
import com.moosilaukecycling.domain.enums.BikeType;

public class FrenchBikePartFactory implements BikePartFactory {

    @Override
    public Frame createFrame(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
                return new HardTailFrame("French Hard Tail Frame");
            case FULL_SUSPENSION:
                return new FullSuspensionFrame("French Full Suspension Frame");
            case RACING:
                return new RacingFrame("French Racing Frame");
            case TIME_TRIAL:
                return new TimeTrialFrame("French Time Trial Frame");
            case CASUAL:
                return new CasualFrame("French Casual Frame");
            case ELECTRIC:
                return new ElectricFrame("French Electric Frame");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public GroupSet createGroupSet(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeGroupSet("French Mountain Bike Group Set");
            case RACING:
                return new RacingGroupSet("French Racing Group Set");
            case TIME_TRIAL:
                return new TimeTrialGroupSet("French Time Trial Group Set");
            case CASUAL:
                return new CasualGroupSet("French Casual Group Set");
            case ELECTRIC:
                return new ElectricGroupSet("French Electric Group Set");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public HandleBars createHandleBars(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeHandleBars("French Mountain Bike Handlebars");
            case RACING:
                return new RacingHandleBars("French Racing Handlebars");
            case TIME_TRIAL:
                return new TimeTrialHandleBars("French Time Trial Handlebars");
            case CASUAL:
            case ELECTRIC:
                return new CasualHandleBars("French Casual Bike Handlebars");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public Saddle createSaddle(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeSaddle("French Mountain Bike Saddle");
            case RACING:
                return new RacingSaddle("French Racing Saddle");
            case TIME_TRIAL:
                return new TimeTrialSaddle("French Time Trial Saddle");
            case CASUAL:
            case ELECTRIC:
                return new ComfortableSaddle("French Comfortable Saddle");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public WheelSet createWheelSet(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeWheelSet("French Mountain Bike Wheel Set");
            case RACING:
                return new RacingWheelSet("French Racing Wheel Set");
            case TIME_TRIAL:
                return new TimeTrialWheelSet("French Time Trial Wheel Set");
            case CASUAL:
            case ELECTRIC:
                return new CasualWheelSet("French Casual WheelSet");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }
}
