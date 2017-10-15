package com.skyline.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by taozh on 2017/10/15.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More mMore;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
