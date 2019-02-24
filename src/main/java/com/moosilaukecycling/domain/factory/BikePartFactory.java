package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.bikeparts.*;
import com.moosilaukecycling.domain.enums.BikeType;

public interface BikePartFactory {

    Frame createFrame(BikeType bikeType);
    GroupSet createGroupSet(BikeType bikeType);
    HandleBars createHandleBars(BikeType bikeType);
    Saddle createSaddle(BikeType bikeType);
    WheelSet createWheelSet(BikeType bikeType);
}
