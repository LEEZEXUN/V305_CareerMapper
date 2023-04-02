package com.example.careermapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class category extends AppCompatActivity {

    private Button button_confirm;
    private Button button_student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        button_student = findViewById(R.id.btn_student);
        LottieAnimationView animationView = findViewById(R.id.frame);
        button_confirm = findViewById(R.id.confirm);

        button_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(category.this, field.class));


            }

        });

        button_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationView.setVisibility(1);
                animationView.playAnimation();

            }

        });


    }

}