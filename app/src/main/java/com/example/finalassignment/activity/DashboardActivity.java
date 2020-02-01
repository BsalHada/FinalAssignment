package com.example.finalassignment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.finalassignment.R;

public class DashboardActivity extends AppCompatActivity {
ImageView img_Routine;
Button btn_login, btn_signup;
CardView cardView_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        img_Routine=findViewById(R.id.img_Routine);
        cardView_profile = findViewById(R.id.profile);

        img_Routine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), RoutineActivity.class);
                startActivity(intent);
            }
        });

        cardView_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}
