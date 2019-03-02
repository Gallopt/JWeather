package com.example.zr.myweather.db;

public class City {
    private int _id;
    private int cid;
    private String location;
    public  City(){
        this._id=_id;
        this.cid=cid;
        this.location=location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
