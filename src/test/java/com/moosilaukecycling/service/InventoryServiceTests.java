package com.moosilaukecycling.service;

import com.google.common.collect.ImmutableList;
import com.moosilaukecycling.concurrent.BikeShopJobManager;
import com.moosilaukecycling.dto.CreateBikeRequest;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static java.lang.Thread.sleep;

public class InventoryServiceTests {

    InventoryService inventoryService;

    @BeforeClass
    public static void setup() {
        BikeShopJobManager.init();
    }

    @Before
    public void init() {
        inventoryService = new InventoryService();
    }

    @Test
    public void testCreateManyItalianRoadBikes() throws InterruptedException {
        generateCreateBikeRequests()
                .parallelStream()
                .forEach(inventoryService::addInventoryItem);

        sleep(20000L);
    }

    private List<CreateBikeRequest> generateCreateBikeRequests() {
        return ImmutableList.of(new CreateBikeRequest("ITALY", "RACING"),
                new CreateBikeRequest("ITALY", "TIME_TRIAL"),
                new CreateBikeRequest("SPAIN", "ELECTRIC"),
                new CreateBikeRequest("USA", "RACING"),
                new CreateBikeRequest("FRANCE", "FULL_SUSPENSION"),
                new CreateBikeRequest("SPAIN", "RACING"),
                new CreateBikeRequest("USA", "CASUAL"),
                new CreateBikeRequest("FRANCE", "RACING"),
                new CreateBikeRequest("ITALY", "HARD_TAIL"),
                new CreateBikeRequest("USA", "TIME_TRIAL"));
    }
}
