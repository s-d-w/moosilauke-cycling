package com.moosilaukecycling.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {

    @Test
    public void testRoadBikeBuilder() {
        RoadBike bike = new RoadBike.Builder("Specialized", "Tarmac", "large")
                .withYear("2018")
                .withRoadBikeType("racing")
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Tarmac", bike.getModel());
        assertEquals("large", bike.getSize());
        assertEquals("2018", bike.getYear());
        assertEquals("racing", bike.getRoadBikeType());
    }

    @Test
    public void testMountainBikeBuilder() {
        MountainBike bike = new MountainBike.Builder("Specialized", "Epic", "large")
                .withYear("2018")
                .withMountainBikeType("full-suspension")
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Epic", bike.getModel());
        assertEquals("large", bike.getSize());
        assertEquals("2018", bike.getYear());
        assertEquals("full-suspension", bike.getMountainBikeType());

    }

    @Test
    public void testCasualBikeBuilder() {
        CasualBike bike = new CasualBike.Builder("Specialized", "Sirrus", "large")
                .withYear("2018")
                .withCasualBikeType("street")
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Sirrus", bike.getModel());
        assertEquals("large", bike.getSize());
        assertEquals("2018", bike.getYear());
        assertEquals("street", bike.getCasualBikeType());

    }
}
