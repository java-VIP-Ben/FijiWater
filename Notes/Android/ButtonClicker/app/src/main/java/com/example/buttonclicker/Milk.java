package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Milk extends AppCompatActivity {

    //BUTTONS
    private Button Milk;
    private Button Outside;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk);

        Milk = findViewById(R.id.btnGetMilk);
        Outside = findViewById(R.id.btnOutside);

        Milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Milk.this, End.class);
                startActivity(i);
            }
        });

        Outside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Milk.this, Store.class);
                startActivity(i);
            }
        });
    }
}