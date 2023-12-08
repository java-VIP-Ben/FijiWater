package com.example.showcase3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //working on documentation with this program
    //these are global variables and resources to be called later
    private Button MadLib, SciFi, NG; //piling them together for efficiency


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the buttons up to function properly
        MadLib = findViewById(R.id.btnMadLib);
        SciFi = findViewById(R.id.btnSciFi);
        NG = findViewById(R.id.btnNG);


        MadLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        SciFi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SciFi.class);
                startActivity(i);
            }
        });

        NG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}