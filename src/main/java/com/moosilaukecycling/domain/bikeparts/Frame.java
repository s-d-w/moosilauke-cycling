package com.moosilaukecycling.domain.bikeparts;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CasualFrame.class, name = "CasualFrame"),
        @JsonSubTypes.Type(value = ElectricFrame.class, name = "ElectricFrame"),
        @JsonSubTypes.Type(value = FullSuspensionFrame.class, name = "FullSuspensionFrame"),
        @JsonSubTypes.Type(value = HardTailFrame.class, name = "HardTailFrame"),
        @JsonSubTypes.Type(value = RacingFrame.class, name = "RacingFrame"),
        @JsonSubTypes.Type(value = TimeTrialFrame.class, name = "TimeTrialFrame")
})
public interface Frame extends BikePart {

    String getFrame();
}
