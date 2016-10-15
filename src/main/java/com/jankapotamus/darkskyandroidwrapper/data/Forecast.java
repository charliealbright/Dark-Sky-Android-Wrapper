package com.jankapotamus.darkskyandroidwrapper.data;

/**
 * Created by Charlie on 10/14/16.
 */

public class Forecast {

    private double latitude;
    private double longitude;
    private String timezone;

    @Override
    public String toString() {
        return "{ Forecast: Lat=" + latitude + ", Long=" + longitude + ", Timezone=" + timezone + "}";
    }
}
