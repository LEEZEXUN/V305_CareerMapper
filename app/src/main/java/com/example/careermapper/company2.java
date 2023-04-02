package com.example.careermapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class company2 extends baseactivity {


    private ImageButton button_back;
    private Button btn_apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company2);

        addHomePageButton();

        button_back = findViewById(R.id.btn_back);

        btn_apply = findViewById(R.id.apply);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(company2.this, Company.class));

                finish();
            }

        });


        btn_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openPopUpWindow();
            }

        });

        VideoView videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.virtualtour1);
        videoView.start();


//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);


    }

    private void openPopUpWindow(){
        Intent popupwindow= new Intent(company2.this, PopUpWindow.class);
        startActivity(popupwindow);

    }

}