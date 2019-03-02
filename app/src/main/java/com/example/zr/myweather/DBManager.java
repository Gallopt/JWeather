package com.example.zr.myweather;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.zr.myweather.db.City;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private  DBOpenHelper helper;
    private SQLiteDatabase db;

    public DBManager(Context context) {
        helper =new DBOpenHelper(context);
        db=helper.getWritableDatabase();
    }

    public void add(List<City> cities){
        db.beginTransaction();
        try {
            for (City c : cities) {
                db.execSQL("insert into city values(null,?,?)",
                        new Object[]{c.getCid(), c.getLocation()});
            }
            db.setTransactionSuccessful();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            db.endTransaction();
        }
    }

    public void delete(){
        db.execSQL("");
    }
    public List<City> findAllcities(){
        ArrayList<City> cities = new ArrayList<City>();
        Cursor c = db.rawQuery("SELECT * FROM city", null);
        while(c.moveToNext()){
            City p = new City();
            p.set_id(c.getInt(c.getColumnIndex("_id")));
            p.setCid(c.getInt(c.getColumnIndex("cid")));
            p.setLocation(c.getString(c.getColumnIndex("location")));
            cities.add(p);
        }
        c.close();
        return cities;
    }
}
