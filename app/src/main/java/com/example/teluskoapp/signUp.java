package com.example.teluskoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class signUp extends AppCompatActivity {

    Button signButton;
    EditText etName;
    EditText etEmail;
    EditText etPass;
    RadioButton rF;
    RadioButton rM;
    RadioGroup rg;

    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signButton = findViewById(R.id.signButton);

        etName = findViewById(R.id.input_name);
        etEmail = findViewById(R.id.input_email);
        etPass = findViewById(R.id.input_pass);

        rF = findViewById(R.id.radioF);
        rM = findViewById(R.id.radioM);
        rg = findViewById(R.id.radioGroup);


        signButton.setOnClickListener(v -> {
            final String name = etName.getText().toString();
            final String email = etEmail.getText().toString();
            final String pass = etPass.getText().toString();

//            String salute = "";
//            if(rF.isSelected()){
//                salute="Ms";
//            }else{
//                salute="Mr";
//            }

            int id = rg.getCheckedRadioButtonId();
            RadioButton rb = rg.findViewById(id);

            Toast.makeText(signUp.this, "Name " + ". " + name + "\n Email " + email + "\n Pass " + pass + rb.getText().toString(), Toast.LENGTH_LONG).show();
            System.out.println("Name " + ". " + name + "\n Email " + email + "\n Pass " + pass);

            Intent intent = new Intent(signUp.this, ShowData.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("pass", pass);
            intent.putExtra("gender", rb.getText().toString());
            startActivity(intent);

        });
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);

        b1.setOnClickListener(v -> {
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.GONE);
            b3.setVisibility(View.VISIBLE);
        });
        b2.setOnClickListener(v -> {
            b1.setVisibility(View.GONE);
            b2.setVisibility(View.INVISIBLE);
            b3.setVisibility(View.VISIBLE);
        });
        b3.setOnClickListener(v -> {
            b1.setVisibility(View.VISIBLE);
            b2.setVisibility(View.INVISIBLE);
            b3.setVisibility(View.GONE);
        });
    }
}