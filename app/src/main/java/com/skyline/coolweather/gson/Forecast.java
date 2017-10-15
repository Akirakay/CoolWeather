package com.skyline.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by taozh on 2017/10/15.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature mTemperature;
    @SerializedName("cond")
    public More mMore;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
