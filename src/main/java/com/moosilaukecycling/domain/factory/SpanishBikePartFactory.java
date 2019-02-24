package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.bikeparts.*;
import com.moosilaukecycling.domain.enums.BikeType;

public class SpanishBikePartFactory implements BikePartFactory {

    @Override
    public Frame createFrame(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
                return new HardTailFrame("Spanish Hard Tail Frame");
            case FULL_SUSPENSION:
                return new FullSuspensionFrame("Spanish Full Suspension Frame");
            case RACING:
                return new RacingFrame("Spanish Racing Frame");
            case TIME_TRIAL:
                return new TimeTrialFrame("Spanish Time Trial Frame");
            case CASUAL:
                return new CasualFrame("Spanish Casual Frame");
            case ELECTRIC:
                return new ElectricFrame("Spanish Electric Frame");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public GroupSet createGroupSet(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeGroupSet("Spanish Mountain Bike Group Set");
            case RACING:
                return new RacingGroupSet("Spanish Racing Group Set");
            case TIME_TRIAL:
                return new TimeTrialGroupSet("Spanish Time Trial Group Set");
            case CASUAL:
                return new CasualGroupSet("Spanish Casual Group Set");
            case ELECTRIC:
                return new ElectricGroupSet("Spanish Electric Group Set");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public HandleBars createHandleBars(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeHandleBars("Spanish Mountain Bike Handlebars");
            case RACING:
                return new RacingHandleBars("Spanish Racing Handlebars");
            case TIME_TRIAL:
                return new TimeTrialHandleBars("Spanish Time Trial Handlebars");
            case CASUAL:
            case ELECTRIC:
                return new CasualHandleBars("Spanish Casual Bike Handlebars");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public Saddle createSaddle(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeSaddle("Spanish Mountain Bike Saddle");
            case RACING:
                return new RacingSaddle("Spanish Racing Saddle");
            case TIME_TRIAL:
                return new TimeTrialSaddle("Spanish Time Trial Saddle");
            case CASUAL:
            case ELECTRIC:
                return new ComfortableSaddle("Spanish Comfortable Saddle");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public WheelSet createWheelSet(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeWheelSet("Spanish Mountain Bike Wheel Set");
            case RACING:
                return new RacingWheelSet("Spanish Racing Wheel Set");
            case TIME_TRIAL:
                return new TimeTrialWheelSet("Spanish Time Trial Wheel Set");
            case CASUAL:
            case ELECTRIC:
                return new CasualWheelSet("Spanish Casual WheelSet");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }
}
