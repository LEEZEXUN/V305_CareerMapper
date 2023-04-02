package com.example.careermapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ChatLayout extends AppCompatActivity {

    ImageButton send_button;
    TextView new_chat;
    EditText edit_text;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chat_layout);

        send_button = findViewById(R.id.send_button);
        new_chat = findViewById(R.id.my_text);
        edit_text = findViewById(R.id.edit_text);
        back = findViewById(R.id.back_button);

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new_chat.setVisibility(View.VISIBLE);
                new_chat.setText(edit_text.getText());
                edit_text.setText("");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Pressed back button!", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(ChatLayout.this, Homepage.class));
                finish();
            }
        });

    }
}