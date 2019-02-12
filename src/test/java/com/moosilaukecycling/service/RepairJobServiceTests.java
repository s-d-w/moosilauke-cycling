package com.moosilaukecycling.service;

import com.moosilaukecycling.concurrent.BikeShopJobManager;
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
    // just runs a bunch of jobs for up to 30 seconds
    public void testRepairJobServiceCreate() throws InterruptedException {
        Stream.generate(this::generateRepairJobRequest)
                .limit(15L)
                .forEach(repairJobService::createRepairJob);

        sleep(30000L);
    }

    private RepairJobRequest generateRepairJobRequest() {
        return new RepairJobRequest("TUNEUP", "some notes");
    }
}
