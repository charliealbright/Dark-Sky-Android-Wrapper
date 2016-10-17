package com.jankapotamus.darkskyandroidwrapper.data;

/**
 * Created by Charlie on 10/16/16.
 */

public class MinuteConditions {

    private int time;
    private double precipIntensity;
    private double precipProbability;

    @Override
    public String toString() {
        return "{MinuteConditions: [Time = " + time + "][PrecipIntensity = " + precipIntensity +
                "][PrecipProbability = " + precipProbability + "]}";
    }
}
