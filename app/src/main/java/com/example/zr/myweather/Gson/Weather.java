package com.example.zr.myweather.Gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public Now now;
    public Lifestyle lifeStyle;

    @SerializedName("daily_forecast")
    public List<Forcast>  forcastList;//由于daily_forecast中包含的是一个数组，因此用List集合来引用Forecast类。

    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;//lifestyle中包含的也是一个数组，用List集合引用Lifestyle类
}
