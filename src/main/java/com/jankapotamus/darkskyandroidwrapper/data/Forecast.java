package com.jankapotamus.darkskyandroidwrapper.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    @SerializedName("minutely")
    private MinutelyForecast minutelyForecast;

    @SerializedName("hourly")
    private HourlyForecast hourlyForecast;

    @SerializedName("daily")
    private DailyForecast dailyForecast;

    @SerializedName("alerts")
    private List<Alert> alerts;

    @Override
    public String toString() {
        return "Forecast:\n" +
                "\t\tLatitude: " + latitude + "\n" +
                "\t\tLongitude: " + longitude + "\n" +
                "\t\tTimezone: " + timezone + "\n" +
                "\t\tOffset: " + offset + "\n" +
                "\t\tCurrently: " + (currentConditions != null ? currentConditions.toString() : "null") + "\n" +
                "\t\tMinutely: " + (minutelyForecast != null ? minutelyForecast.toString() : "null") + "\n" +
                "\t\tHourly: " + (hourlyForecast != null ? hourlyForecast.toString() : "null") + "\n" +
                "\t\tDaily: " + (dailyForecast != null ? dailyForecast.toString() : "null") + "\n" +
                "\t\tAlerts: " + (alerts != null ? alerts.toString() : "null") + "\n";
    }
}
