package com.example.careermapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class baseactivity extends AppCompatActivity {

    private Button button_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseactivity);





    }


    protected void addHomePageButton() {
        button_home = findViewById(R.id.home);

        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(baseactivity.this, Homepage.class));


            }

        });
    }
}