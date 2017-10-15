package com.skyline.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by taozh on 2017/10/15.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update mUpdate;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
