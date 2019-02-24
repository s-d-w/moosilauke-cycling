package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.bikeparts.*;
import com.moosilaukecycling.domain.enums.BikeType;

public class ItalianBikePartFactory implements BikePartFactory  {

    @Override
    public Frame createFrame(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
                return new HardTailFrame("Italian Hard Tail Frame");
            case FULL_SUSPENSION:
                return new FullSuspensionFrame("Italian Full Suspension Frame");
            case RACING:
                return new RacingFrame("Italian Racing Frame");
            case TIME_TRIAL:
                return new TimeTrialFrame("Italian Time Trial Frame");
            case CASUAL:
                return new ComfortFrame("Italian Casual Frame");
            case ELECTRIC:
                return new ElectricFrame("Italian Electric Frame");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public GroupSet createGroupSet(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeGroupSet("Italian Mountain Bike Group Set");
            case RACING:
                return new RacingGroupSet("Italian Racing Group Set");
            case TIME_TRIAL:
                return new TimeTrialGroupSet("Italian Time Trial Group Set");
            case CASUAL:
                return new CasualGroupSet("Italian Casual Group Set");
            case ELECTRIC:
                return new ElectricGroupSet("Italian Electric Group Set");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public HandleBars createHandleBars(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeHandleBars("Italian Mountain Bike Handlebars");
            case RACING:
                return new RacingHandleBars("Italian Racing Handlebars");
            case TIME_TRIAL:
                return new TimeTrialHandleBars("Italian Time Trial Handlebars");
            case CASUAL:
            case ELECTRIC:
                return new CasualHandleBars("Italian Casual Bike Handlebars");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public Saddle createSaddle(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeSaddle("Italian Mountain Bike Saddle");
            case RACING:
                return new RacingSaddle("Italian Racing Saddle");
            case TIME_TRIAL:
                return new TimeTrialSaddle("Italian Time Trial Saddle");
            case CASUAL:
            case ELECTRIC:
                return new ComfortableSaddle("Italian Comfortable Saddle");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }

    @Override
    public WheelSet createWheelSet(BikeType bikeType) {
        switch (bikeType) {
            case HARD_TAIL:
            case FULL_SUSPENSION:
                return new MountainBikeWheelSet("Italian Mountain Bike Wheel Set");
            case RACING:
                return new RacingWheelSet("Italian Racing Wheel Set");
            case TIME_TRIAL:
                return new TimeTrialWheelSet("Italian Time Trial Wheel Set");
            case CASUAL:
            case ELECTRIC:
                return new CasualWheelSet("Italian Casual WheelSet");
            default:
                throw new IllegalArgumentException("Unknown Bike Type");
        }
    }
}
