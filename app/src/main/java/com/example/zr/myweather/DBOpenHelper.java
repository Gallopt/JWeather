package com.example.zr.myweather;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DBOpenHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME ="city.db";
    private static final int DATEBASE_VERSION=1;
    private static final String CREATE_TABLE="create table if not exists city(_id INTEGER PRIMARY KEY AUTOINCREMENT," + "cid INTEGER,location TEXT)";

    public DBOpenHelper( Context context) {
        super(context, DATABASE_NAME, null, DATEBASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
