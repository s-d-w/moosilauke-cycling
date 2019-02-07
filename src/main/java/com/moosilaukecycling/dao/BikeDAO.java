package com.moosilaukecycling.dao;

import com.moosilaukecycling.domain.RoadBike;

import java.sql.Connection;

public class BikeDAO {

    public void createRoadBike(RoadBike bike) {
        Connection connection = SQLiteConnection.getConnection();
    }
}
