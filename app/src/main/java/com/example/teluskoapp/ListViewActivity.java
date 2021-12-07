package com.example.teluskoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListViewActivity extends AppCompatActivity {
ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv= findViewById(R.id.progList);
        String values []= {"C","C++","JAVA", "Assembly", "C#", "Scala", "Android"};
        ArrayAdapter  arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Arrays.asList(values));
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(ListViewActivity.this,"You choose: "+values[position],Toast.LENGTH_SHORT).show();
        });
    }
}