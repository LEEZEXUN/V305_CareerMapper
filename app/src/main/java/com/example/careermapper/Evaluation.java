package com.example.careermapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Evaluation extends AppCompatActivity {


    ImageButton back;
    Button bt_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluation);

        back = findViewById(R.id.btn_back);

       back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Evaluation.this, Internship.class));

                finish();
            }

        });


        bt_home = findViewById(R.id.home);

        bt_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Evaluation.this, HomeFragment.class));

                finish();
            }

        });
    }
}