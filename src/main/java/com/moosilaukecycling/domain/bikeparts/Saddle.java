package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ComfortableSaddle.class, name = "ComfortableSaddle"),
        @JsonSubTypes.Type(value = MountainBikeSaddle.class, name = "MountainBikeSaddle"),
        @JsonSubTypes.Type(value = RacingSaddle.class, name = "RacingSaddle"),
        @JsonSubTypes.Type(value = TimeTrialSaddle.class, name = "TimeTrialSaddle")
})
public interface Saddle extends BikePart {

    String getSaddle();
}
