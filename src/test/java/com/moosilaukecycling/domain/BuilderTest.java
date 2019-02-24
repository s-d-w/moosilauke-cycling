package com.moosilaukecycling.domain;

import com.moosilaukecycling.domain.bikeparts.ComfortableSaddle;
import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.ItalianBikePartFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuilderTest {

    @Test
    public void testRoadBikeDefaultBuilder() {
        Bike bike = new RoadBike.Builder("Specialized", "Tarmac")
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Tarmac", bike.getModel());
        assertEquals("American Racing Frame", bike.getFrame().getFrame());
        assertEquals(BikeType.RACING, bike.getBikeType());
    }

    @Test
    public void testRoadBikeBuilderWithCustomFactory() {
        Bike bike = new RoadBike.Builder("Specialized", "Tarmac")
                .withBikePartFactory(new ItalianBikePartFactory())
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Tarmac", bike.getModel());
        assertEquals("Italian Racing Frame", bike.getFrame().getFrame());
        assertEquals(BikeType.RACING, bike.getBikeType());
    }

    @Test
    public void testRoadBikeBuilderWithCustomFactoryAndCustomSaddle() {
        Bike bike = new RoadBike.Builder("Specialized", "Tarmac")
                .withBikePartFactory(new ItalianBikePartFactory())
                .withRacingSaddle(new ComfortableSaddle("A comfortable racing saddle"))
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Tarmac", bike.getModel());
        assertEquals("Italian Racing Frame", bike.getFrame().getFrame());
        assertEquals("A comfortable racing saddle", bike.getSaddle().getSaddle());
        assertEquals(BikeType.RACING, bike.getBikeType());
    }

    @Test
    public void testRoadBikeBuilderWithCustomSaddle() {
        Bike bike = new RoadBike.Builder("Specialized", "Tarmac")
                .withRacingSaddle(new ComfortableSaddle("A comfortable racing saddle"))
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Tarmac", bike.getModel());
        assertEquals("American Racing Frame", bike.getFrame().getFrame());
        assertEquals("A comfortable racing saddle", bike.getSaddle().getSaddle());
        assertEquals(BikeType.RACING, bike.getBikeType());
    }

    @Test
    public void testTimeTrialBikeBuilder() {
        Bike bike = new TimeTrialBike.Builder("Specialized", "TT")
                .withYear("2018")
                .withSize("large")
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("TT", bike.getModel());
        assertEquals("large", bike.getSize());
        assertEquals("2018", bike.getYear());
        assertEquals(BikeType.TIME_TRIAL, bike.getBikeType());
    }

    @Test
    public void testHardTailBikeBuilder() {
        Bike bike = new HardTailMountainBike.Builder("Specialized", "Epic")
                .withYear("2018")
                .withSize("large")
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Epic", bike.getModel());
        assertEquals("large", bike.getSize());
        assertEquals("2018", bike.getYear());
        assertEquals(BikeType.HARD_TAIL, bike.getBikeType());
    }

    @Test
    public void testFullSuspensionMountainBikeBuilder() {
        Bike bike = new FullSuspensionMountainBike.Builder("Specialized", "Epic")
                .withYear("2018")
                .withSize("large")
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Epic", bike.getModel());
        assertEquals("large", bike.getSize());
        assertEquals("2018", bike.getYear());
        assertEquals(BikeType.FULL_SUSPENSION, bike.getBikeType());
    }

    @Test
    public void testCasualBikeBuilder() {
        Bike bike = new CasualBike.Builder("Specialized", "Sirrus")
                .withYear("2018")
                .withSize("large")
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Sirrus", bike.getModel());
        assertEquals("large", bike.getSize());
        assertEquals("2018", bike.getYear());
        assertEquals(BikeType.CASUAL, bike.getBikeType());
    }

    @Test
    public void testElectricBikeBuilder() {
        Bike bike = new ElectricBike.Builder("Specialized", "Sirrus")
                .withYear("2018")
                .withSize("large")
                .build();

        assertEquals("Specialized", bike.getMake());
        assertEquals("Sirrus", bike.getModel());
        assertEquals("large", bike.getSize());
        assertEquals("2018", bike.getYear());
        assertEquals(BikeType.ELECTRIC, bike.getBikeType());
    }
}
