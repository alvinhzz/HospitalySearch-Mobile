package com.example.aslamadinalvianhaz.medicalysearch;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String NAMA_DATABASE = "datapasien.db";
    private static final int VERSI_DATABASE = 1;

    public DataHelper(Context context){
        super(context, NAMA_DATABASE, null, VERSI_DATABASE);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "create table pasien(nik text primary key, nama text null, tgl_lahir text null ,kelamin text null, " +
                "alamat text null)";
        Log.d("Data", "onCreate : "+sql);
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
