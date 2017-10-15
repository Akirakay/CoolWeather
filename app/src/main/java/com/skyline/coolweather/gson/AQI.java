package com.skyline.coolweather.gson;

/**
 * Created by taozh on 2017/10/15.
 */

public class AQI {
    public AQICity mCity;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
