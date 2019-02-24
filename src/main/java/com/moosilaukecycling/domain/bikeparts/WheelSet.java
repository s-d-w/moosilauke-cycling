package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CasualWheelSet.class, name = "CasualWheelSet"),
        @JsonSubTypes.Type(value = MountainBikeWheelSet.class, name = "MountainBikeWheelSet"),
        @JsonSubTypes.Type(value = RacingWheelSet.class, name = "RacingWheelSet"),
        @JsonSubTypes.Type(value = TimeTrialWheelSet.class, name = "TimeTrialWheelSet")
})
public interface WheelSet extends BikePart {

    String getWheelSet();

}
