package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Railing extends AppCompatActivity {

    private Button Reset;
    private TextView DeathMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_railing);

        DeathMessage = findViewById(R.id.tvDeathMessage);
        Reset = findViewById(R.id.btnReset);
        String firstName = getIntent().getStringExtra("firstName");
        String lastName = getIntent().getStringExtra("lastName");

        String text = String.format("Yeah %s, we're calling it a day. . . \n I take it this ends the %s legacy for now? " ,firstName, lastName);
        DeathMessage.setText(text);

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Railing.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}