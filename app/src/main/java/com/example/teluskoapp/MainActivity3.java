package com.example.teluskoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    EditText num1, num2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        num1=findViewById(R.id.numer1);
        num2=findViewById(R.id.numer2);
        btn=findViewById(R.id.btnAdd);

        btn.setOnClickListener(v -> {
            int i = Integer.parseInt(num1.getText().toString());
            int j = Integer.parseInt(num2.getText().toString());

        });
    }

    public class MultiTask extends AsyncTask<String,String,String>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }

        @Override
        protected String doInBackground(String... strings) {


            return null;
        }
    }
}