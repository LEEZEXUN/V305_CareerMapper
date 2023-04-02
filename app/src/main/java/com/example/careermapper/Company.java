package com.example.careermapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Company extends AppCompatActivity {


    private ImageButton button_back;
    private ImageButton btn_job1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company);

        button_back = findViewById(R.id.btn_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Company.this, Homepage.class));

              finish();
            }

        });

        btn_job1 = findViewById(R.id.job1);
        btn_job1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Company.this, company2.class));

                finish();
            }

        });
    }
}