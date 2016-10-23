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
    @Deprecated
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

    @SerializedName("flags")
    private ForecastFlags flags;


    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public int getOffset() {
        return offset;
    }

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }

    public MinutelyForecast getMinutelyForecast() {
        return minutelyForecast;
    }

    public HourlyForecast getHourlyForecast() {
        return hourlyForecast;
    }

    public DailyForecast getDailyForecast() {
        return dailyForecast;
    }

    public List<Alert> getAlerts() {
        return alerts;
    }

    public ForecastFlags getFlags() {
        return flags;
    }

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
                "\t\tAlerts: " + (alerts != null ? alerts.toString() : "null") + "\n" +
                "\t\tFlags: " + (flags != null ? flags.toString() : "null") + "\n";
    }
}
