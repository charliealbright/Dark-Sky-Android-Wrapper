package com.jankapotamus.darkskyandroidwrapper;

import com.jankapotamus.darkskyandroidwrapper.data.ExclusionList;
import com.jankapotamus.darkskyandroidwrapper.data.Forecast;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Charlie on 10/14/16.
 */

public interface DarkSkyService {

    @GET("/mock-data.json")
    Call<Forecast> getStaticForecast();

    @GET("/forecast/{apiKey}/{lat},{long}")
    Call<Forecast> getForecast(@Path("apiKey") String apiKey, @Path("lat") double latitude, @Path("long") double longitude);

    @GET("/forecast/{apiKey}/{lat},{long}")
    Call<Forecast> getForecast(@Path("apiKey") String apiKey, @Path("lat") double latitude, @Path("long") double longitude, @Query("exclude") ExclusionList exclusionList);
}
