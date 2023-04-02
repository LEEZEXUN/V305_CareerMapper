package com.example.careermapper;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class startpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);

        Thread thread = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(2000);
                    startActivities(new Intent[]{new Intent(startpage.this, login.class)});
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }; thread.start();

    }
}