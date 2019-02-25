package com.moosilaukecycling.exception;

public class BikeShopJsonProcessingException extends RuntimeException {

    public BikeShopJsonProcessingException(String message) {
        super(message);
    }

    public BikeShopJsonProcessingException(Throwable cause) {
        super(cause);
    }
}
