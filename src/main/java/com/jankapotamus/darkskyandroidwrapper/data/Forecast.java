package com.jankapotamus.darkskyandroidwrapper.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Charlie on 10/14/16.
 */

public class Forecast {

    private double latitude;
    private double longitude;
    private String timezone;
    private int offset;

    @SerializedName("currently")
    private CurrentConditions currentConditions;

    @Override
    public String toString() {
        return "Forecast:\n" +
                "\t\tLatitude: " + latitude + "\n" +
                "\t\tLongitude: " + longitude + "\n" +
                "\t\tTimezone: " + timezone + "\n" +
                "\t\tOffset: " + offset + "\n" +
                "\t\tCurrently: " + currentConditions.toString() + "\n";
    }
}
