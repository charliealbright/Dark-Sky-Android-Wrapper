package com.jankapotamus.darkskyandroidwrapper.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Charlie on 10/16/16.
 */

public class DailyForecast {

    private String summary;

    @SerializedName("icon")
    private String iconString;

    @SerializedName("data")
    private List<DayConditions> dailyConditionsList;

    @Override
    public String toString() {
        return "{DailyForecast: [Summary = " + summary + "][IconString = " + iconString +
                "][DailyConditionsList = " + dailyConditionsList.toString() + "]}";
    }
}
