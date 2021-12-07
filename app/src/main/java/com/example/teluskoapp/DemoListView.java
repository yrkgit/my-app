package com.example.teluskoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DemoListView extends AppCompatActivity {
ListView lv;
Context context;
ArrayList progList;

public static Integer [] progImages= {
  R.drawable.ic_one,R.drawable.ic_two,R.drawable.ic_three,
  R.drawable.ic_one,R.drawable.ic_two,R.drawable.ic_three,
  R.drawable.ic_one,R.drawable.ic_two,R.drawable.ic_three
};

public static String [] progNames={
        "Object", "Class", "Polymorphism", "JDBC", "Abstract", "Constructor", "Android","Swing"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_list_view);

        MyListAdapter adapter= new MyListAdapter(this,progNames,progImages);
        lv=findViewById(R.id.lista);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(DemoListView.this,"Click: "+ progNames[position],Toast.LENGTH_SHORT).show();
        });
    }
}