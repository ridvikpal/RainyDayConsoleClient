package org.rainyday;

/*
* This class manages all the API calls to the Weather API
* Created by: Ridvik Pal
* */

/* IMPORT LIBRARIES */
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/* MAIN CLASS DECLARATION */
public class Connection {
    // The API key for weather api
    private static String API_KEY = "53e3613c3ddf44c5ba2232504231107";
    public void getWeather(String _city, boolean _airQuality)
            throws URISyntaxException, IOException, InterruptedException {
        String airQualitySwitch;
        if (_airQuality) airQualitySwitch = "yes";
        else airQualitySwitch = "no";

        String uriString = "https://api.weatherapi.com/v1/current.json?key=" + API_KEY
                + "&q=" + _city + "&aqi=" + airQualitySwitch;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(uriString)).build();

        client.sendAsync(getRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}