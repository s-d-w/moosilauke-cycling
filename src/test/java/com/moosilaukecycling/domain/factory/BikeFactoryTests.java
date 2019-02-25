package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.domain.enums.BikeCountry;
import com.moosilaukecycling.domain.enums.BikeType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BikeFactoryTests {

    @Test
    public void testRoadBikeFactory() {
        Bike roadBike = BikeCatalog.orderBike(BikeCountry.USA, BikeType.RACING);

        assertEquals(BikeType.RACING, roadBike.getBikeType());
        assertEquals("American Racing Frame", roadBike.getFrame().getFrame());
        assertEquals("American Racing Handlebars", roadBike.getHandleBars().getHandleBars());
    }

    @Test
    public void testTimeTrialBikeFactory() {
        Bike timeTrialBike = BikeCatalog.orderBike(BikeCountry.SPAIN, BikeType.TIME_TRIAL);

        assertEquals(BikeType.TIME_TRIAL, timeTrialBike.getBikeType());
        assertEquals("Spanish Time Trial Frame", timeTrialBike.getFrame().getFrame());
        assertEquals("Spanish Time Trial Handlebars", timeTrialBike.getHandleBars().getHandleBars());
    }

    @Test
    public void testCasualBikeFactory() {
        Bike casualBike = BikeCatalog.orderBike(BikeCountry.USA, BikeType.CASUAL);

        assertEquals(BikeType.CASUAL, casualBike.getBikeType());
        assertEquals("American Casual Frame", casualBike.getFrame().getFrame());
        assertEquals("American Casual Bike Handlebars", casualBike.getHandleBars().getHandleBars());
    }

    @Test
    public void testElectricBikeFactory() {
        Bike casualBike = BikeCatalog.orderBike(BikeCountry.ITALY, BikeType.ELECTRIC);

        assertEquals(BikeType.ELECTRIC, casualBike.getBikeType());
        assertEquals("Italian Electric Frame", casualBike.getFrame().getFrame());
        assertEquals("Italian Casual Bike Handlebars", casualBike.getHandleBars().getHandleBars());
    }

    @Test
    public void testFullSuspensionMountainBikeFactory() {
        Bike mountainBike = BikeCatalog.orderBike(BikeCountry.USA, BikeType.FULL_SUSPENSION);

        assertEquals(BikeType.FULL_SUSPENSION, mountainBike.getBikeType());
        assertEquals("American Full Suspension Frame", mountainBike.getFrame().getFrame());
        assertEquals("American Mountain Bike Handlebars", mountainBike.getHandleBars().getHandleBars());
    }

    @Test
    public void testHardTailMountainBikeFactory() {
        Bike mountainBike = BikeCatalog.orderBike(BikeCountry.FRANCE, BikeType.HARD_TAIL);

        assertEquals(BikeType.HARD_TAIL, mountainBike.getBikeType());
        assertEquals("French Hard Tail Frame", mountainBike.getFrame().getFrame());
        assertEquals("French Mountain Bike Handlebars", mountainBike.getHandleBars().getHandleBars());
    }
}
