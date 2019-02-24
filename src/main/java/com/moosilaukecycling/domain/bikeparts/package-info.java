package com.moosilaukecycling.domain.bikeparts;

/*
    Bike parts:
        - frame
        - wheel set
        - group set
        - handlebars
        - saddle
 */

/* The factories are setup to create parts by country. These could easily be made to make parts
   by brand with BrandFactory's instead of CountryFactory's. By doing so by brand, you'd want
   to create brand specific parts such as SpecializedTarmac implements Frame which could
   implement specific functionality such as a call to tightenProprietaryBolts() in its repair
   method. But, for now just going with generic parts, which take a String parameter, so as not
   to necessitate creating a concrete part for each brand, for each bike type */