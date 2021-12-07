package com.example.teluskoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button b;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        b = findViewById(R.id.calcButton);
        ans = findViewById(R.id.ansText);
        b.setOnClickListener(v -> {
                    int readNum1 = Integer.parseInt(num1.getText().toString());
                    int readNum2 = Integer.parseInt(num2.getText().toString());
                    int calc = readNum1 + readNum2;
                    ans.setText("Ans is: " + calc);
                }
        );
    }


    public void addV (View v){
        int readNum1= Integer.parseInt(num1.getText().toString());
        int readNum2= Integer.parseInt(num2.getText().toString());
        int calc= readNum1+readNum2;
        ans.setText("Ans is: "+calc);
    }
}