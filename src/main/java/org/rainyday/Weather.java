package org.rainyday;

/* IMPORT CLASSES */
import com.google.gson.annotations.SerializedName;

import java.util.StringJoiner;

public class Weather {
    private Location location;
    private Current current;

    // GETTERS AND SETTERS
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    // toString method overloading
    @Override
    public String toString(){
        return new StringJoiner("\n", "", "")
                .add("location: " + this.getLocation())
                .add("current: " + this.getCurrent())
                .toString();
    }
}

class Location{
    private String name, region, country, tz_id, localtime;

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

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
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

class Current{

    private double temp_c, temp_f, wind_mph, wind_kph, pressure_mb, pressure_in, feelslike_c, feelslike_f
            , vis_km, vis_miles, uv, precip_mm, precip_in, gust_mph, gust_kph;

    private int is_day, last_updated_epoch, wind_degree, humidity, cloud;

    private String last_updated, wind_dir;

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

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
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

class Condition{
    private String text, icon;
    private int code;

    // GETTERS AND SETTERS
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    // toString method overloading
    public String toString(){
        return new StringJoiner("\n\t\t\t", "(\n\t\t\t", "\n\t\t\t)")
                .add("text=" + this.getText())
                .add("icon=" + this.getIcon())
                .add("code=" + this.getCode())
                .toString();
    }
}

class AirQuality{
    private double co, no2, o3, so2, pm2_5, pm10;
    @SerializedName("us-epa-index")
    private int us_epa_index;

    @SerializedName("gb-defra-index")
    private int gb_defra_index;

    // GETTERS AND SETTERS
    public double getCo() {
        return co;
    }

    public void setCo(double co) {
        this.co = co;
    }

    public double getNo2() {
        return no2;
    }

    public void setNo2(double no2) {
        this.no2 = no2;
    }

    public double getO3() {
        return o3;
    }

    public void setO3(double o3) {
        this.o3 = o3;
    }

    public double getSo2() {
        return so2;
    }

    public void setSo2(double so2) {
        this.so2 = so2;
    }

    public double getPm2_5() {
        return pm2_5;
    }

    public void setPm2_5(double pm2_5) {
        this.pm2_5 = pm2_5;
    }

    public double getPm10() {
        return pm10;
    }

    public void setPm10(double pm10) {
        this.pm10 = pm10;
    }

    public int getUs_epa_index() {
        return us_epa_index;
    }

    public void setUs_epa_index(int us_epa_index) {
        this.us_epa_index = us_epa_index;
    }

    public int getGb_defra_index() {
        return gb_defra_index;
    }

    public void setGb_defra_index(int gb_defra_index) {
        this.gb_defra_index = gb_defra_index;
    }

    // toString method overloading
    public String toString(){
        return new StringJoiner("\n\t\t\t", "(\n\t\t\t", "\n\t\t\t)")
                .add("co=" + this.getCo())
                .add("no2=" + this.getNo2())
                .add("o3=" + this.getO3())
                .add("so2=" + this.getSo2())
                .add("pm2_5=" + this.getPm2_5())
                .add("pm10=" + this.getPm10())
                .add("us-epa-index=" + this.getUs_epa_index())
                .add("gb-defra-index=" + this.getGb_defra_index())
                .toString();
    }
}
