package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CasualGroupSet.class, name = "CasualGroupSet"),
        @JsonSubTypes.Type(value = ElectricGroupSet.class, name = "ElectricGroupSet"),
        @JsonSubTypes.Type(value = MountainBikeGroupSet.class, name = "MountainBikeGroupSet"),
        @JsonSubTypes.Type(value = RacingGroupSet.class, name = "RacingGroupSet"),
        @JsonSubTypes.Type(value = TimeTrialGroupSet.class, name = "TimeTrialGroupSet")
})
public interface GroupSet extends BikePart {

    String getGroupSet();

}
