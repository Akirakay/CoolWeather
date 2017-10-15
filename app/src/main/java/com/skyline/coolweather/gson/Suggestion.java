package com.skyline.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by taozh on 2017/10/15.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort mComfort;
    @SerializedName("cw")
    public CarWash mCarWash;

    public Sport mSport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
