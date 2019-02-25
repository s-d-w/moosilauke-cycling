package com.moosilaukecycling.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.domain.enums.BikeCountry;
import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.BikeCatalog;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class JsonUtilTests {

    @Test
    public void testSerializeThenDeserializeItalianTimeTrialBike() {
        Bike bike = BikeCatalog.orderBike(BikeCountry.ITALY, BikeType.TIME_TRIAL);

        String json = "";
        try {
            json = JsonUtil.toJsonString(bike);
        } catch (JsonProcessingException e) {
            Assert.fail(e.getMessage());
        }

        try {
            Bike ttBike = JsonUtil.fromJsonString(json, Bike.class);
            Assert.assertEquals("Italian Time Trial Frame", ttBike.getFrame().getFrame());
            Assert.assertEquals(bike.getId(), ttBike.getId());
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }
}
