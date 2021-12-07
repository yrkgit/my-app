package com.example.teluskoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    TextView name, email, gender, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Intent intent = getIntent();

        String nameS = intent.getStringExtra("name");
        String emailS = intent.getStringExtra("email");
        String passS = intent.getStringExtra("pass");
        String genderS = intent.getStringExtra("gender");

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        gender = findViewById(R.id.gender);
        pass = findViewById(R.id.pass);

        name.setText(nameS);
        email.setText(emailS);
        gender.setText(genderS);
        pass.setText(passS);

    }
}