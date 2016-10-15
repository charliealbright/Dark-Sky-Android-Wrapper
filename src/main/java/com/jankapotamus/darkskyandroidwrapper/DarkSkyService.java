package com.jankapotamus.darkskyandroidwrapper;

import com.jankapotamus.darkskyandroidwrapper.data.Forecast;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Charlie on 10/14/16.
 */

public interface DarkSkyService {

    @GET("/assets/mock-data.json")
    Call<Forecast> getStaticForecast();
}
