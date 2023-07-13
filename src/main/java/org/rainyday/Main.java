package org.rainyday;

public class Main {
    public static void main(String[] args){
        // create a connection object
        Connection connectionObject = new Connection();

//        connectionObject.getCurrentWeather("toro-molise-italy", "yes");
        connectionObject.getAstronomy("Toronto", "2023-07-13");
    }
}