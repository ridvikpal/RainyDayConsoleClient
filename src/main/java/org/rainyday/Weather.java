package org.rainyday;

/* IMPORT CLASSES */

import java.util.StringJoiner;

public class Weather {
    private Location location;
    private Current current;
    private Forecast forecast;
    private Astronomy astronomy;
    private Alert alerts;

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

    public Alert getAlerts() {
        return alerts;
    }
}