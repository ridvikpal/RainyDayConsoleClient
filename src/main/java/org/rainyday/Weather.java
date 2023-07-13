package org.rainyday;

/* IMPORT CLASSES */

import java.util.StringJoiner;

public class Weather {
    private Location location;
    private Current current;

    // GETTERS AND SETTERS
    public Location getLocation() {
        return location;
    }

    public Current getCurrent() {
        return current;
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