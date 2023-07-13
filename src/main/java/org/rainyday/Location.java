package org.rainyday;

import java.util.Date;
import java.util.StringJoiner;

public class Location{
    private String name, region, country, tz_id;

    Date localtime;

    private double lat, lon;

    private int localtime_epoch;

    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTz_id() {
        return tz_id;
    }

    public void setTz_id(String tz_id) {
        this.tz_id = tz_id;
    }

    public Date getLocaltime() {
        return localtime;
    }

    public void setLocaltime(Date localtime) {
        this.localtime = localtime;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getLocaltime_epoch() {
        return localtime_epoch;
    }

    public void setLocaltime_epoch(int localtime_epoch) {
        this.localtime_epoch = localtime_epoch;
    }

    // toString method overloading
    @Override
    public String toString(){
        return new StringJoiner("\n\t\t", "[\n\t\t", " \n\t\t]")
                .add("name=" + this.getName())
                .add("region=" + this.getRegion())
                .add("country=" + this.getCountry())
                .add("lat=" + this.getLat() + ", lon=" + this.getLon())
                .add("tz_id=" + this.getTz_id())
                .add("localtime_epoch=" + this.getLocaltime_epoch())
                .add("localtime=" + this.getLocaltime())
                .toString();
    }
}