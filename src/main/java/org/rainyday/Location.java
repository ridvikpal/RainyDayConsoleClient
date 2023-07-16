package org.rainyday;

import java.util.Date;
import java.util.StringJoiner;

public class Location{
    private String name, region, country, tz_id;

    Date localtime;

    private double lat, lon;

    private int localtime_epoch;

    // GETTERS
    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public String getTz_id() {
        return tz_id;
    }

    public Date getLocaltime() {
        return localtime;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public int getLocaltime_epoch() {
        return localtime_epoch;
    }

}