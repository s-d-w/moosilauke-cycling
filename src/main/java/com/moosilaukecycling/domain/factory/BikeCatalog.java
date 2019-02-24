package com.moosilaukecycling.domain.factory;

import com.moosilaukecycling.domain.Bike;
import com.moosilaukecycling.domain.enums.BikeCountry;
import com.moosilaukecycling.domain.enums.BikeType;

public class BikeCatalog {

    private BikeCatalog() { }

    private static BikeFactory americanBikeFactory;
    private static BikeFactory frenchBikeFactory;
    private static BikeFactory italianBikeFactory;
    private static BikeFactory spanishBikeFactory;

    static {
        americanBikeFactory = new AmericanBikeFactory();
        frenchBikeFactory = new FrenchBikeFactory();
        italianBikeFactory = new ItalianBikeFactory();
        spanishBikeFactory = new SpanishBikeFactory();
    }

    public static Bike orderBike(BikeType bikeType, BikeCountry bikeCountry) {
        switch (bikeCountry) {
            case USA:
                return americanBikeFactory.orderBike(bikeType);
            case FRANCE:
                return frenchBikeFactory.orderBike(bikeType);
            case ITALY:
                return italianBikeFactory.orderBike(bikeType);
            case SPAIN:
                return spanishBikeFactory.orderBike(bikeType);
            default:
                throw new IllegalArgumentException("Unknown Bike Country of Origin.");
        }
    }
}
