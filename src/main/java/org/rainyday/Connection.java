package org.rainyday;

/*
* This class manages all the API calls to the Weather API
* Created by: Ridvik Pal
* */

/* IMPORT LIBRARIES */
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/* MAIN CLASS DECLARATION */
public class Connection {
    // The API key for weather api
    private static final String API_KEY = "53e3613c3ddf44c5ba2232504231107";

    private final HttpClient client = HttpClient.newHttpClient();

    public void getWeather(String _city, boolean _airQuality) {

        // determine if air quality is to be received in the request
        String airQualitySwitch;
        if (_airQuality) airQualitySwitch = "yes";
        else airQualitySwitch = "no";

        // the url to get the information from
        String url = "https://api.weatherapi.com/v1/current.json?key=" + API_KEY
                + "&q=" + _city + "&aqi=" + airQualitySwitch;

        // create a GET http request
        HttpRequest getRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {
            // send the request to the server using the client
            HttpResponse<String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());

            // capture the result from GSON and put it into a Weather
            Weather result = new Gson().fromJson(getResponse.body(), Weather.class);

            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}