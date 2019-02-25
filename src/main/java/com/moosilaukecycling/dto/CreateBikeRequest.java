package com.moosilaukecycling.dto;

public class CreateBikeRequest {

    private String bikeType;
    private String bikeCountry;

    public CreateBikeRequest() { }

    public CreateBikeRequest(String bikeCountry, String bikeType) {
        this.bikeCountry = bikeCountry;
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public String getBikeCountry() {
        return bikeCountry;
    }

    public void setBikeCountry(String bikeCountry) {
        this.bikeCountry = bikeCountry;
    }
}
