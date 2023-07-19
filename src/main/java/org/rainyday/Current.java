package org.rainyday;

import java.util.StringJoiner;

public class Current{
    private double temp_c, temp_f, wind_mph, wind_kph, pressure_mb, pressure_in, feelslike_c, feelslike_f
            , vis_km, vis_miles, uv, precip_mm, precip_in, gust_mph, gust_kph;

    private int is_day, last_updated_epoch, wind_degree, humidity, cloud;

    private String wind_dir, last_updated;

    private Condition condition;

    private AirQuality air_quality;

    // GETTERS
    public double getTemp_c() {
        return temp_c;
    }

    public double getTemp_f() {
        return temp_f;
    }

    public double getWind_mph() {
        return wind_mph;
    }

    public double getWind_kph() {
        return wind_kph;
    }

    public double getPressure_mb() {
        return pressure_mb;
    }

    public double getPressure_in() {
        return pressure_in;
    }

    public double getFeelslike_c() {
        return feelslike_c;
    }

    public double getFeelslike_f() {
        return feelslike_f;
    }

    public double getVis_km() {
        return vis_km;
    }

    public double getVis_miles() {
        return vis_miles;
    }

    public double getUv() {
        return uv;
    }

    public double getPrecip_mm() {
        return precip_mm;
    }

    public double getPrecip_in() {
        return precip_in;
    }

    public double getGust_mph() {
        return gust_mph;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    public int getIs_day() {
        return is_day;
    }

    public int getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public int getWind_degree() {
        return wind_degree;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getCloud() {
        return cloud;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public Condition getCondition() {
        return condition;
    }

    public AirQuality getAir_quality() {
        return air_quality;
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
                .add("uv=" + this.getUv())
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