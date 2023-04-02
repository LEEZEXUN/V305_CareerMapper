package com.example.careermapper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class matching1 extends AppCompatActivity {
    private Button first_profile;
    private Button second_profile;
    private Button third_profile;

    private ImageButton button_back;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching1);




        first_profile = findViewById(R.id.bt1);
        second_profile = findViewById(R.id.bt2);
        third_profile = findViewById(R.id.bt3);

        first_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching1.this, matching2.class);
                startActivity(intent);

            }
        });

        second_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching1.this, matching2.class);
                startActivity(intent);
            }
        });

        third_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(matching1.this, matching2.class);
                startActivity(intent);
            }
        });




        button_back = findViewById(R.id.btn_back);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(matching1.this, Homepage.class));

                finish();
            }

        });



    }


}