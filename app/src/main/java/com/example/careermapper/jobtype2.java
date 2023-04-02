package com.example.careermapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jobtype2 extends AppCompatActivity {

    private  Button button_writing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobtype2);

        button_writing = findViewById(R.id.myButton3);

        button_writing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(jobtype2.this, loadingpage.class));


            }

        });
    }


}