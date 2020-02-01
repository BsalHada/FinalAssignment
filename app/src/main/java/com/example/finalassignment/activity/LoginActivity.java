package com.example.finalassignment.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.finalassignment.LoginBllClass;
import com.example.finalassignment.MainActivity;
import com.example.finalassignment.R;
import com.example.finalassignment.StrictModeClass;

public class LoginActivity extends AppCompatActivity {
Button btnreg;

EditText emails,passwords;
ImageButton back;
Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnreg= findViewById(R.id.signin);
        back= findViewById(R.id.ic_back);
        signin=findViewById(R.id.signin);

        emails=findViewById(R.id.email);
        passwords=findViewById(R.id.password);

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
//                Intent intent= new Intent(getApplicationContext(), RegistrationActivity.class);
//                startActivity(intent);
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

    private void login() {
        String email = emails.getText().toString();
        String password = passwords.getText().toString();
        LoginBllClass LoginBllClass = new LoginBllClass();
        StrictModeClass.StrictMode();
        if (LoginBllClass.checkuser(email, password)) {
            // Intent intent = new Intent(LoginActivity.this, LandingActivity.class);
            Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Either username or password is incorrect", Toast.LENGTH_SHORT).show();
            emails.requestFocus();
        }


    }

}
