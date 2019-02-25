package com.moosilaukecycling.service;

import com.moosilaukecycling.concurrent.BikeShopJobManager;
import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.domain.enums.BikeCountry;
import com.moosilaukecycling.domain.enums.BikeType;
import com.moosilaukecycling.domain.factory.BikeCatalog;
import com.moosilaukecycling.dto.RepairJobRequest;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class RepairJobServiceTests {

    RepairJobService repairJobService;

    @BeforeClass
    public static void setup() {
        BikeShopJobManager.init();
    }

    @Before
    public void init() {
        repairJobService = new RepairJobService();
    }

    @Test
    // just runs a bunch of jobs for up to 20 seconds
    public void testRepairJobServiceCreate() throws InterruptedException {
        Stream.generate(this::generateRepairJobRequest)
                .limit(15L)
                .forEach(repairJobService::createRepairJob);

        sleep(20000L);
    }

    private RepairJobRequest generateRepairJobRequest() {
        /* need to create bike first, then repair by passing an ID instead of a bike
         * this is just a quick fix for now                                         */
        Bike bike = BikeCatalog.orderBike(BikeCountry.SPAIN, BikeType.TIME_TRIAL);
        return new RepairJobRequest("TUNEUP", "some notes", bike);
    }
}
