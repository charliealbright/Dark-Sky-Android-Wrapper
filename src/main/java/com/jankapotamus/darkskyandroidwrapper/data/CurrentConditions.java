package com.jankapotamus.darkskyandroidwrapper.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Charlie on 10/16/16.
 */

public class CurrentConditions {

    private int time;
    private String summary;
    @SerializedName("icon")
    private String iconString;
    private int nearestStormDistance;
    private int nearestStormBearing;
    private int precipIntensity;
    private int precipProbability;
    private double temperature;
    private double apparentTemperature;
    private double dewPoint;
    private double humidity;
    private double windSpeed;
    private int windBearing;
    private double visibility;
    private double cloudCover;
    private double pressure;
    private double ozone;

    @Override
    public String toString() {
        return "{CurrentConditions: [Time = " + time + "][Summary = " + summary + "][IconString = "
                + iconString + "][NearestStormDistance = " + nearestStormDistance + "][NearestStormBearing = "
                + nearestStormBearing + "][PrecipIntensity = " + precipIntensity + "][PrecipProbability = "
                + precipProbability + "][Temperature = " + temperature + "][ApparentTemperature = "
                + apparentTemperature + "][DewPoint = " + dewPoint + "][Humidity = " + humidity
                + "][WindSpeed = " + windSpeed + "][WindBearing = " + windBearing + "][Visibility = "
                + visibility + "][CloudCover = " + cloudCover + "][Pressure = " + pressure + "][Ozone = "
                + ozone + "]}";
    }
}
