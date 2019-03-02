package com.example.zr.myweather.Gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("cond_code")
    public String condCode;

    @SerializedName("cond_txt")
    public String condTxt;

    @SerializedName("hum")
    public String hum;

    @SerializedName("tmp")
    public String tmp;

    @SerializedName("vis")
    public String vis;

    @SerializedName("wind_dir")
    public String windDir;

    @SerializedName("wind_sc")
    public String windSc;

}
