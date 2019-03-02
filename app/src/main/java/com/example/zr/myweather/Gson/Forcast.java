package com.example.zr.myweather.Gson;

import com.google.gson.annotations.SerializedName;

public class Forcast {
    public String date;

    @SerializedName("cond_code_d")
    public String condCodeD;

    @SerializedName("cond_code_n")
    public String condCodeN;

    @SerializedName("cond_txt_d")
    public String condTxtD;

    @SerializedName("cond_txt_n")
    public String condTxtN;

    @SerializedName("hum")
    public String hum;

    @SerializedName("tmp_max")
    public String tmpMax;

    @SerializedName("tmp_min")
    public String tmpMin;

    @SerializedName("vis")
    public String vis;

    @SerializedName("wind_dir")
    public String windDir;

    @SerializedName("wind_sc")
    public String windSc;
}
