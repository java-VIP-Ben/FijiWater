package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class End extends AppCompatActivity {

    //THE ENDING THINGY
    private EditText leave;
    private Button check;
    boolean correct = false;
    private String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        leave = findViewById(R.id.txtPassword);
        check = findViewById(R.id.btnCheck);


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer = String.valueOf(leave.getText());
                if(answer.equals("Taylor")) {
                    

                } else {
                    Intent i = new Intent(End.this, Sleep.class);
                    startActivity(i);
                }
            }
        });
    }
}