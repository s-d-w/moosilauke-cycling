package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CasualHandleBars.class, name = "CasualHandleBars"),
        @JsonSubTypes.Type(value = MountainBikeHandleBars.class, name = "MountainBikeHandleBars"),
        @JsonSubTypes.Type(value = RacingHandleBars.class, name = "RacingHandleBars"),
        @JsonSubTypes.Type(value = TimeTrialHandleBars.class, name = "TimeTrialHandleBars")
})
public interface HandleBars extends BikePart {

    String getHandleBars();
}
