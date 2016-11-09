[![GitHub release](https://img.shields.io/github/release/charliealbright/darkskyandroid.svg?maxAge=2592000)](https://github.com/charliealbright/DarkSkyAndroid/releases)
[![GitHub issues](https://img.shields.io/github/issues/charliealbright/darkskyandroid.svg)](https://github.com/charliealbright/CircleProgressBar/issues)
[![GitHub license](https://img.shields.io/badge/license-Apache%202.0-lightgrey.svg)](https://raw.githubusercontent.com/charliealbright/DarkSkyAndroid/master/LICENSE)
[![GitHub watchers](https://img.shields.io/github/watchers/charliealbright/darkskyandroid.svg?style=social&label=Watch&maxAge=2592000)]()

# Dark Sky Android Wrapper
####An Android wrapper for the Dark Sky weather API. Uses Retrofit and OkHttp.

## Usage
The Dark Sky Android Wrapper is simple to set up - you'll be fetching the Forecast in just minutes.

### Import
Add this line into your `build.gradle` file to import the library:

```gradle
compile 'com.charliealbright:dark-sky-android:1.0.0'
```

### Simple Requests
In your Activity, do the following to create the request service:

```android
Retrofit retrofit = new Retrofit.Builder()
	.baseUrl("https://api.darksky.net")
	.addConverterFactory(GsonConverterFactory.create())
	.build();
	
DarkSkyService darkSkyService = retrofit.create(DarkSkyService.class);
```

Then, make a call to the service like so:

```android
Call<Forecast> forecastCall = mDarkSkyService.getForecast("< Dark Sky Dev Key Here >", 30.9764799, -97.778059, null);
forecastCall.enqueue(this);
```
Capture the response of the call in the activity by implementing Callback interface:

```android
public class MainActivity extends AppCompatActivity implements Callback<Forecast> {

	// Rest of Activity up here....

	@Override
    public void onResponse(Call<Forecast> call, Response<Forecast> response) {
        Forecast forecast = response.body();
        if (forecast != null) {
            Log.d("[RESPONSE]", forecast.toString());
            // Proceed to consume received Forecast
        }
    }

    @Override
    public void onFailure(Call<Forecast> call, Throwable t) {
        Snackbar.make(getWindow().getDecorView(), "Error in call: " + t.getLocalizedMessage(), Snackbar.LENGTH_LONG)
                .setAction("OK", null)
                .show();
    }
}
```

### Advanced Requests
Dark Sky supports a variety of query parameters to manipulate the content of the Forecast returned by their API. All query parameters are supported as of version 1.1.0. Here are some example usages:

```android
Map<String, String> queryMap = new HashMap<>();
queryMap.put(Exclusion.HTTP_QUERY_KEY, Exclusion.MINUTELY.toString() + "," + Exclusion.FLAGS.toString()); // Exclude the "minutely" and "flags" block from the response
queryMap.put(Language.HTTP_QUERY_KEY, Language.FRENCH.toString()); // Change language of response to French
queryMap.put(Units.HTTP_QUERY_KEY, Units.SI.toString()); // Change measurement units to auto-select based off of lat/long
queryMap.put(Forecast.EXTEND_HOURLY_KEY, Forecast.EXTEND_HOURLY_VALUE); // Extend hourly forecast to 168 hours
```

Then, add the query parameters to the request:

```android
Call<Forecast> forecastCall = mDarkSkyService.getForecast("< Dark Sky Dev Key Here >", 30.9764799, -97.778059, queryMap);
forecastCall.enqueue(this);
```

Additional 