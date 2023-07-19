package org.rainyday;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("***RAINYDAY CONSOLE VERSION***\n");
        System.out.println("Commands are as follows:\n");
        System.out.println("CURRENT %city name, postal code, ip address, or longitude/latitude%");
        System.out.println("\t gets current weather data for the given location");
        System.out.println("\t Example: CURRENT Toronto");

        System.out.println("FORECAST %city name, postal code, ip address, or longitude/latitude% %number of days%");
        System.out.println("\t gets forecast data for given number of days for the given location");
        System.out.println("\t Example: FORECAST Toronto 2");

        System.out.println("ASTRONOMY %city name, postal code, ip address, or longitude/latitude% " +
                "%date in format YYYY-MM-DD%");
        System.out.println("\t gets astronomy data for given date for the given location");
        System.out.println("\t Example: ASTRONOMY Toronto 2023-07-10");

        System.out.println("SEARCH %city name, postal code, ip address, or longitude/latitude%");
        System.out.println("\t searches possible locations to retrieve data for in the WeatherAPI database");
        System.out.println("\t Example: SEARCH Toron");

        System.out.println("EXIT");
        System.out.println("\t exits the program");

        String command[];
        Scanner inputScanner = new Scanner(System.in);
        Connection connection = new Connection();

        do {
            System.out.print("> ");
            command = inputScanner.nextLine().split(" ");

            try{
                if (command[0].equalsIgnoreCase("CURRENT")){
                    connection.getCurrentWeather(command[1]);
                }else if (command[0].equalsIgnoreCase("FORECAST")){
                    connection.getForecast(command[1], Integer.parseInt(command[2]));
                }else if (command[0].equalsIgnoreCase("ASTRONOMY")){
                    connection.getAstronomy(command[1], command[2]);
                }else if (command[0].equalsIgnoreCase("SEARCH")){
                    connection.getAutocompleteTerm(command[1]);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }while (!(command[0].equalsIgnoreCase("EXIT")));
    }
}