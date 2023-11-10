package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sleep extends AppCompatActivity {

    private Button up;
    private Button living;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);

        up = findViewById(R.id.btnUp);
        living = findViewById(R.id.btnLivingRoom);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sleep.this, Explore.class);
                startActivity(i);
            }
        });

        living.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sleep.this, home.class);
                startActivity(i);
            }
        });
    }
}