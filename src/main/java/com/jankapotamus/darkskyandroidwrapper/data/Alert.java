package com.jankapotamus.darkskyandroidwrapper.data;

/**
 * Created by Charlie on 10/18/16.
 */

public class Alert {

    private String title;
    private int time;
    private int expires;
    private String description;
    private String uri;

    @Override
    public String toString() {
        return "{Alert: " +
                "[Title = " + title +
                "][Time = " + time +
                "][Expires = " + expires +
                "][Description = " + description +
                "][URI = " + uri + "]}";

    }
}
