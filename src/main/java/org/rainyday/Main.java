package org.rainyday;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        // create a connection object
        Connection connectionObject = new Connection();

        // testing getWeather method
        connectionObject.getWeather("London", false);
    }
}