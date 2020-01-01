package com.example.finalassignment.activity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.finalassignment.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RegistrationActivity extends AppCompatActivity {
ImageView icg_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        icg_back=findViewById(R.id.icg_back);

        icg_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), LandingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
