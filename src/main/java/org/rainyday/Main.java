package org.rainyday;

public class Main {
    public static void main(String[] args){
        // create a connection object
        Connection connectionObject = new Connection();

        // testing getWeather method
        connectionObject.getWeather("Toronto", true);
    }
}