package org.rainyday;

import java.util.StringJoiner;

public class Astro {
    private String sunrise, sunset, moonrise, moonset;
    private String  moon_phase;
    private int moon_illumination, is_moon_up, is_sun_up;

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public String getMoonset() {
        return moonset;
    }

    public String getMoon_phase() {
        return moon_phase;
    }

    public int getMoon_illumination() {
        return moon_illumination;
    }

    public int getIs_moon_up() {
        return is_moon_up;
    }

    public int getIs_sun_up() {
        return is_sun_up;
    }
}
