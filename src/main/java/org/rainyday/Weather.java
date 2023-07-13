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