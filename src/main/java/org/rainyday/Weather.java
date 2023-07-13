package org.rainyday;

/* IMPORT CLASSES */

import com.google.gson.annotations.SerializedName;

import java.util.StringJoiner;

public class Weather {
    private Location location;
    private Current current;
//    @SerializedName("astro")
    private Astronomy astronomy;

    // GETTERS
    public Location getLocation() {
        return location;
    }

    public Current getCurrent() {
        return current;
    }

    public Astronomy getAstronomy() {
        return astronomy;
    }

    // toString method overloading
    @Override
    public String toString(){
        return new StringJoiner("\n", "", "")
                .add("location: " + this.getLocation())
                .add("current: " + this.getCurrent())
                .add("astronomy: " + this.getAstronomy())
                .toString();
    }
}