package org.rainyday;

/*
* This class manages all the API calls to the Weather API
* Created by: Ridvik Pal
* */

/* IMPORT LIBRARIES */
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Date;

/* MAIN CLASS DECLARATION */
public class Connection {
    // The API key for weather api
    private static final String API_KEY = "53e3613c3ddf44c5ba2232504231107";

    private final HttpClient client = HttpClient.newHttpClient();

    public void getCurrentWeather(String _q, String _airQuality) {
        // the url to get the information from
        String url = "https://api.weatherapi.com/v1/current.json?key=" + API_KEY
                + "&q=" + _q + "&aqi=" + _airQuality;

        // create a GET http request
        HttpRequest currentWeatherRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {
            // send the request to the server using the client
            HttpResponse<String> currentWeatherResponse = client.send(currentWeatherRequest,
                    HttpResponse.BodyHandlers.ofString());

            // capture the result from GSON and put it into a Weather
            Weather result = new GsonBuilder().registerTypeAdapter(Date.class, new DateTimeDeserializer()).create()
                    .fromJson(currentWeatherResponse.body(), Weather.class);

            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getAstronomy(String _q, String _dt){
        String url = "https://api.weatherapi.com/v1/astronomy.json?key=" + API_KEY
                + "&q=" + _q + "&dt=" + _dt;

        HttpRequest astronomyRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {
            // send the request to the server using the client
            HttpResponse<String> astronomyResponse = client.send(astronomyRequest,
                    HttpResponse.BodyHandlers.ofString());

            // capture the result from GSON and put it into a Weather
            Weather result = new GsonBuilder().registerTypeAdapter(Date.class, new DateTimeDeserializer()).create()
                    .fromJson(astronomyResponse.body(), Weather.class);

            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getForecast(String _q, int _days, boolean _airQuality){

    }

    public void getAutocompleteTerm(){

    }
}