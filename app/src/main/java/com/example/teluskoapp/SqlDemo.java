package com.example.teluskoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.sql.SQLData;

public class SqlDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql_demo);

        StudenDbHelper dbHelper = new StudenDbHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("sid","2");
        values.put("sname","Janusz");
        values.put("marks","60");

        long row = db.insert("student", null, values);
        System.out.println("Row: " + row);

//        SQLiteDatabase db = dbHelper.getReadableDatabase();
//        String projection[] = {"sid","name","marks"};
//
//        Cursor c = db.query("student", projection, null, null, null, null, null);

//        c.moveToFirst();
//        System.out.println("Name:"+ c.getString(0));
    }
}