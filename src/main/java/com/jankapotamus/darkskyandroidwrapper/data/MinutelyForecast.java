package com.jankapotamus.darkskyandroidwrapper.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Charlie on 10/16/16.
 */

public class MinutelyForecast {

    private String summary;

    @SerializedName("icon")
    private String iconString;

    @SerializedName("data")
    private List<MinuteConditions> minuteConditionsList;

    @Override
    public String toString() {
        return "{MinutelyForecast: [Summary = " + summary + "][IconString = " + iconString +
                "][MinuteConditionsList = " + minuteConditionsList.toString() + "]}";
    }
}
