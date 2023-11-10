package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Explore extends AppCompatActivity {

    //BUTTONS BUTTONS AND BUTTONS
    private Button push;
    private Button neighbor;
    private Button home;
    private String name = "it's over";
    private String lastName = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        push = findViewById(R.id.btnPush);
        neighbor = findViewById(R.id.btnDownstairs);
        home = findViewById(R.id.btnHome);




        //moving the character around
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Explore.this, Railing.class);
                i.putExtra("firstName" , name);
                i.putExtra("lastName" , lastName);
                startActivity(i);
            }
        });

        neighbor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Explore.this, Downstairs.class);
                startActivity(i);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Explore.this, home.class);
                startActivity(i);
            }
        });
    }
}