package com.syf.coolweather.gson;

/**
 * Created by syf on 2017/3/11.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
