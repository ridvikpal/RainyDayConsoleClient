package org.rainyday;

import java.util.Date;
import java.util.StringJoiner;

public class Current{
    private double temp_c, temp_f, wind_mph, wind_kph, pressure_mb, pressure_in, feelslike_c, feelslike_f
            , vis_km, vis_miles, uv, precip_mm, precip_in, gust_mph, gust_kph;

    private int is_day, last_updated_epoch, wind_degree, humidity, cloud;

    private String wind_dir;

    private Date last_updated;

    private Condition condition;

    private AirQuality air_quality;

    // GETTERS AND SETTERS
    public double getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(double temp_c) {
        this.temp_c = temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }

    public double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(double wind_kph) {
        this.wind_kph = wind_kph;
    }

    public double getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(double pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public double getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(double pressure_in) {
        this.pressure_in = pressure_in;
    }

    public double getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(double feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public double getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(double feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public double getVis_km() {
        return vis_km;
    }

    public void setVis_km(double vis_km) {
        this.vis_km = vis_km;
    }

    public double getVis_miles() {
        return vis_miles;
    }

    public void setVis_miles(double vis_miles) {
        this.vis_miles = vis_miles;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public double getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(double precip_mm) {
        this.precip_mm = precip_mm;
    }

    public double getPrecip_in() {
        return precip_in;
    }

    public void setPrecip_in(double precip_in) {
        this.precip_in = precip_in;
    }

    public double getGust_mph() {
        return gust_mph;
    }

    public void setGust_mph(double gust_mph) {
        this.gust_mph = gust_mph;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    public void setGust_kph(double gust_kph) {
        this.gust_kph = gust_kph;
    }

    public int getIs_day() {
        return is_day;
    }

    public void setIs_day(int is_day) {
        this.is_day = is_day;
    }

    public int getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setLast_updated_epoch(int last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public void setWind_degree(int wind_degree) {
        this.wind_degree = wind_degree;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public void setCloud(int cloud) {
        this.cloud = cloud;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public AirQuality getAir_quality() {
        return air_quality;
    }

    public void setAir_quality(AirQuality air_quality) {
        this.air_quality = air_quality;
    }

    // toString method overloading
    public String toString(){
        String part1 = new StringJoiner("\n\t\t", "[\n\t\t", "")
                .add("temp_c=" + this.getTemp_c())
                .add("temp_f=" + this.getTemp_f())
                .add("wind_mph=" + this.getWind_mph())
                .add("wind_kph=" + this.getWind_kph())
                .add("feelslike_c=" + this.getFeelslike_c())
                .add("feelslike_f=" + this.getFeelslike_f())
                .add("pressure_mb=" + this.getPressure_mb())
                .add("pressure_in=" + this.getPressure_in())
                .add("vis_km=" + this.getVis_km())
                .add("vis_miles=" + this.getVis_miles())
                .add("precip_mm=" + this.getPrecip_mm())
                .add("precip_in=" + this.getPrecip_in())
                .add("gust_mph=" + this.getGust_mph())
                .add("gust_kph="+ this.getGust_kph())
                .add("is_day="+ this.getIs_day())
                .add("last_updated_epoch="+ this.getLast_updated_epoch())
                .add("last_updated=" + this.getLast_updated())
                .add("wind_degree=" + this.getWind_degree())
                .add("humidity=" + this.getHumidity())
                .add("cloud=" + this.getCloud())
                .add("wind_dir=" + this.getWind_dir())
                .toString();

        String part2 = new StringJoiner("\n\t\t", "\t", "\n\t\t]")
                .add("condition=" + this.getCondition())
                .add("air_quality=" + this.getAir_quality())
                .toString();

        return part1 + "\n\t" + part2;
    }
}