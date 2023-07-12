package org.rainyday;

import com.google.gson.annotations.SerializedName;

public class WeatherObject {
    private LocationObject location;
    private CurrentObject current;
}

class LocationObject{
    private String name, region, country, tz_id, localtime;

    private double lat, lon;

    private int localtime_epoch;
}

class CurrentObject{

    private double temp_c, temp_f, wind_mph, wind_kph, pressure_mb, pressure_in, feelslike_c, feelslike_f
            , vis_km, vis_miles, uv, precip_mm, precip_in, gust_mph, gust_kph;

    private int is_day, last_updated_epoch, wind_degree, humidity, cloud;

    private String last_updated, wind_dir;

    private ConditionObject condition;

    private AirQualityObject air_quality;

}

class ConditionObject{
    private String text, icon;
    private int code;
}

class AirQualityObject{
    private double co, no2, o3, so2, pm2_5, pm10;
    @SerializedName("us-epa-index")
    private int us_epa_index;

    @SerializedName("gb-defra-index")
    private int gb_defra_index;
}
