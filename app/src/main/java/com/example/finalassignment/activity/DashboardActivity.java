package com.example.finalassignment.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.finalassignment.R;

public class DashboardActivity extends AppCompatActivity {
ImageView img_Routine;
Button btn_login, btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        img_Routine=findViewById(R.id.img_Routine);

        img_Routine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), RoutineActivity.class);
                startActivity(intent);
            }
        });

    }
}
