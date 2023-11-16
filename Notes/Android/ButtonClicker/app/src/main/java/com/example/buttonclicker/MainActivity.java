package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean correct = getIntent().getBooleanExtra("correct",false);
        String finalText = getIntent().getStringExtra("finalText");

        Button start = findViewById(R.id.btnStart);
        TextView endText = findViewById(R.id.txtEnd);

        if(correct) {
            assert finalText != null;
            endText.setText(String.format(finalText));
        }

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, home.class);
                startActivity(i);
            }
        });
    }
}