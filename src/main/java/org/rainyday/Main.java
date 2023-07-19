package org.rainyday;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // create a connection object to establish connection with API
        Connection connectionObject = new Connection();

//        Weather test = connectionObject.getCurrentWeather("Jacksonville", "yes");
//        Weather test = connectionObject.getAstronomy("Toronto", "2023-07-13");
//        Weather test = connectionObject.getForecast("Toronto", 1, "yes", "yes");
        ArrayList<AutoCompleteElement> test = connectionObject.getAutocompleteTerm("Tor");

        test.forEach((x) -> System.out.println(x));

        System.out.println("Done");
    }
}