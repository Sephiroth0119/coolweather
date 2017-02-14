package com.example.sephiroth.coolweather.gson;

/**
 * Created by Sephiroth on 17/2/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String api;
        public String pm25;
    }
}
