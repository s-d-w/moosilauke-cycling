package com.moosilaukecycling.domain.enums;

import java.util.EnumSet;

public enum BikeType {
    HARD_TAIL,
    FULL_SUSPENSION,
    TIME_TRIAL,
    RACING,
    CASUAL,
    ELECTRIC;

    public static final EnumSet<BikeType> MOUNTAIN_BIKE_STYLES = EnumSet.of(HARD_TAIL, FULL_SUSPENSION);

    public static final EnumSet<BikeType> ROAD_BIKE_STYLES = EnumSet.of(TIME_TRIAL, RACING);

    public static final EnumSet<BikeType> CASUAL_BIKE_STYLES = EnumSet.of(CASUAL, ELECTRIC);
}
