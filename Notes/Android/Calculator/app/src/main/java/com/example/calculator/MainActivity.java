package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //global variables


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number1TXT = findViewById(R.id.number1TXT);
        EditText number2TXT = findViewById(R.id.number2TXT);
        Button addBTN = findViewById(R.id.addBTN);
        Button subBTN = findViewById(R.id.subBTN);
        Button multBTN = findViewById(R.id.multBTN);
        Button divBTN = findViewById(R.id.divBTN);
        TextView output = findViewById(R.id.outputTXT);

        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer = num1+num2;
                output.setText(String.valueOf(answer));
            }
        });

        subBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer = num1-num2;
                output.setText(String.valueOf(answer));
            }
        });

        multBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer = num1*num2;
                output.setText(String.valueOf(answer));
            }
        });

        divBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(String.valueOf(number1TXT.getText()));
                double num2 = Double.parseDouble(String.valueOf(number2TXT.getText()));
                double answer = num1/num2;
                output.setText(String.valueOf(answer));
            }
        });
    }
}