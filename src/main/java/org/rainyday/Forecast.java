package org.rainyday;

import java.util.ArrayList;

public class Forecast {
    ArrayList<ForecastSubClass> forecastday;

    static private class ForecastSubClass{
        private String date;
        private int date_epoch;
        private Astronomy astro;
        private Day day;

        static private class Day {
            private double maxtemp_c, maxtemp_f, mintemp_c, mintemp_f, avgtemp_c, avgtemp_f, maxwind_mph
                    , maxwind_kph, totalprecip_mm, totalprecip_in, totalsnow_cm, avgvis_km, avgvis_miles
                    , avghumidity, uv;
            private Condition condition;
            private AirQuality air_quality;

            public double getMaxtemp_c() {
                return maxtemp_c;
            }

            public double getMaxtemp_f() {
                return maxtemp_f;
            }

            public double getMintemp_c() {
                return mintemp_c;
            }

            public double getMintemp_f() {
                return mintemp_f;
            }

            public double getAvgtemp_c() {
                return avgtemp_c;
            }

            public double getAvgtemp_f() {
                return avgtemp_f;
            }

            public double getMaxwind_mph() {
                return maxwind_mph;
            }

            public double getMaxwind_kph() {
                return maxwind_kph;
            }

            public double getTotalprecip_mm() {
                return totalprecip_mm;
            }

            public double getTotalprecip_in() {
                return totalprecip_in;
            }

            public double getTotalsnow_cm() {
                return totalsnow_cm;
            }

            public double getAvgvis_km() {
                return avgvis_km;
            }

            public double getAvgvis_miles() {
                return avgvis_miles;
            }

            public double getAvghumidity() {
                return avghumidity;
            }

            public double getUv() {
                return uv;
            }

            public Condition getCondition() {
                return condition;
            }

            public AirQuality getAir_quality() {
                return air_quality;
            }

//            @Override
//            public String toString(){
//                return new StringJoiner("\n\t\t\t\t", "(\n\t\t\t\t", "\n\t\t\t\t)")
//                        .add("maxtemp_c=" + maxtemp_c)
//                        .add("maxtemp_f=" + maxtemp_f)
//                        .add("avgtemp_c=" + avgtemp_c)
//                        .add("avgtemp_f=" + avgtemp_f)
//                        .add("maxwind_mph=" + maxwind_kph)
//                        .add("maxwind_kph=" + maxwind_kph)
//                        .add("maxwind_kph=")
//                        .toString();
//            }
        }
        ArrayList<Hour> hour;
        static private class Hour {
            private int time_epoch, is_day, wind_degree, humidity, cloud, will_it_rain, chance_of_rain
                    , will_it_snow, chance_of_snow;
            private String time, wind_dir;
            private double temp_c, temp_f, wind_mph, wind_kph, pressure_mb, pressure_in, precip_mm, precip_in
                    , feelslike_c, feelslike_f, windchill_c, windchill_f, heatindex_c, heatindex_f, dewpoint_c
                    , dewpoint_f, vis_km, vis_miles, gust_mph, gust_kph, uv;
            private Condition condition;
            private AirQuality air_quality;
        }

    }
}