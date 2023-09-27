package com.example.scifi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect a java object to the widget
        EditText firsttxt = findViewById(R.id.editTextText2);
        EditText lasttxt = findViewById(R.id.editTextText9);
        EditText citytxt = findViewById(R.id.editTextText4);
        EditText schooltxt = findViewById(R.id.editTextText7);
        EditText pettxt = findViewById(R.id.editTextText8);
        EditText siblingtxt = findViewById(R.id.editTextText6);
        Button generatebtn = findViewById(R.id.button);
        TextView outputtxt = findViewById(R.id.textView12);

        generatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randy = new Random();

                String first = String.valueOf(firsttxt.getText());
                String last = String.valueOf(lasttxt.getText());
                String city = String.valueOf(citytxt.getText());
                String school = String.valueOf(schooltxt.getText());
                String pet = String.valueOf(pettxt.getText());
                String sibling = String.valueOf(siblingtxt.getText());

                int firstPortion = randy.nextInt(first.length());
                int lastPortion = randy.nextInt(last.length());
                String scifiFirst = first.substring(0, firstPortion) + last.substring(0, lastPortion);
                firstPortion = randy.nextInt(city.length());
                lastPortion = randy.nextInt(school.length());
                String scifiLast = city.substring(0, firstPortion) + school.substring(0, lastPortion);
                firstPortion = randy.nextInt(pet.length());
                lastPortion = randy.nextInt(sibling.length());
                String scifiOrigin = pet.substring(0, firstPortion) + sibling.substring(0, lastPortion);
                //scifiFirst = first.substring(0,randy.nextInt(first.length()))+last.substring(0,randy.nextInt(last.length()));
                outputtxt.setText(scifiFirst + " " + scifiLast + " of the planet: " + scifiOrigin + ".");
            }
        });
    }
}
