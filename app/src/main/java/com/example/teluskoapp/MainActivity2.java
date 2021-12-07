package com.example.teluskoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView txtName, txtNumber, txtBalance;
    Button btnName, btnNumber, btnBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtName = findViewById(R.id.txtName);
        txtNumber = findViewById(R.id.txtNumber);
        txtBalance = findViewById(R.id.txtBalance);

        btnName = findViewById(R.id.nameButton);
        btnNumber = findViewById(R.id.numberButton);
        btnBalance = findViewById(R.id.balanceButton);

        btnName.setOnClickListener(v ->
        {
            txtName.setText("Test");
        });
        btnNumber.setOnClickListener(v -> {
            txtNumber.setText("21234");
        });
        btnBalance.setOnClickListener(v -> {


            View view = LayoutInflater.from(MainActivity2.this).inflate(R.layout.activity_alert_demo, null);

            EditText username = view.findViewById(R.id.userName);
            EditText password = view.findViewById(R.id.password);

            AlertDialog.Builder aBuilder = new AlertDialog.Builder(MainActivity2.this);
            aBuilder.setMessage("Login")
                    .setView(view)
                    .setPositiveButton("Login", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            String u= username.getText().toString();
                            String p= password.getText().toString();

                            if (u.equals("Jan")&&p.equals("1234")){
                                txtBalance.setText("665566");
                            }else{
                                Toast.makeText(MainActivity2.this,"Błędne hasło lub login",Toast.LENGTH_LONG).show();
                            }

                        }
                    }).setNegativeButton("Cancel", null)
                    .setCancelable(false);

            AlertDialog alert = aBuilder.create();
            alert.show();
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder aBuilder = new AlertDialog.Builder(MainActivity2.this);
        aBuilder.setTitle("EXIT")
                .setMessage("Are you sure?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity2.super.onBackPressed();
                    }
                }).setNegativeButton("No", null);

        AlertDialog alert = aBuilder.create();
        alert.show();
    }
}