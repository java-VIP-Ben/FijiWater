package com.example.lifecyclenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Wompwomp extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wompwomp);


        TextView textView = findViewById(R.id.txtPassedText);
        textView.setText(getIntent().getStringExtra("input"));
    }
}