package com.moosilaukecycling;

import com.moosilaukecycling.api.terminal.Terminal;
import com.moosilaukecycling.concurrent.BikeShopJobManager;

public class MoosilaukeCyclingApp {

    public static void main(String[] args) {
        initialize();
        Terminal terminal = new Terminal();
        terminal.run();
        terminal.close();
    }

    private static void initialize() {
        BikeShopJobManager.init();
    }
}
