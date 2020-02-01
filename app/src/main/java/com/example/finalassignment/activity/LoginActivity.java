package com.example.finalassignment.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.finalassignment.R;

public class LoginActivity extends AppCompatActivity {
Button btnreg;

EditText email,password;
ImageButton back;
Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnreg= findViewById(R.id.signin);
        back= findViewById(R.id.ic_back);
        signin=findViewById(R.id.signin);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), LandingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
