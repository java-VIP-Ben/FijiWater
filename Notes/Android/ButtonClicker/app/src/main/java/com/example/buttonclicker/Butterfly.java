package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Butterfly extends AppCompatActivity {

    //Setting up the buttons for the end of the game
    private Button crunch;
    private Button store;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterfly);

        crunch = findViewById(R.id.btnCrunch);
        store = findViewById(R.id.btnStore);
        String firstName = getIntent().getStringExtra("firstName");
        String lastName = getIntent().getStringExtra("lastName");

        crunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Achievement unlocked:\nLife Decisions", Toast.LENGTH_LONG).show();
                Intent i = new Intent(Butterfly.this, Railing.class);
                i.putExtra("firstName" , firstName);
                i.putExtra("lastName" , lastName);
                startActivity(i);
            }
        });

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Butterfly.this, Store.class);
                startActivity(i);
            }
        });
    }
}