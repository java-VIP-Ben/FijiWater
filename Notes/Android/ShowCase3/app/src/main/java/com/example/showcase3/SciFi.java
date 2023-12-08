package com.example.showcase3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class SciFi extends AppCompatActivity {


    //more variables
    private Button back, generate, home;
    private EditText first, last, city, school, pet, sibling;
    private TextView output;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_fi);

        //text views
        first.findViewById(R.id.txtFirst);
        last.findViewById(R.id.txtLast);
        city.findViewById(R.id.txtCity);
        school.findViewById(R.id.txtSchool);
        pet.findViewById(R.id.txtPet);
        sibling.findViewById(R.id.txtSibling);
        output.findViewById(R.id.txtOutput);




        //using a button to generate the sci fi story
        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creating a random event to generate the substrings (if substrings work)
                Random randy = new Random();

                //getting the text values so substring can work
                String fName = String.valueOf(first.getText());
                String lName = String.valueOf(last.getText());
                String cLive = String.valueOf(city.getText());
                String sLive = String.valueOf(school.getText());
                String domestic = String.valueOf(pet.getText());
                String housemate = String.valueOf(sibling.getText());

                //getting the answers for the inputs
                int firstPortion = randy.nextInt(fName.length());
                int lastPortion = randy.nextInt(lName.length());
                String scifiFirst = fName.substring(0, firstPortion) + lName.substring(0, lastPortion);
                firstPortion = randy.nextInt(cLive.length());
                lastPortion = randy.nextInt(sLive.length());
                String scifiLast = cLive.substring(0, firstPortion) + sLive.substring(0, lastPortion);
                firstPortion = randy.nextInt(domestic.length());
                lastPortion = randy.nextInt(housemate.length());
                String scifiOrigin = domestic.substring(0, firstPortion) + housemate.substring(0, lastPortion);
                output.setText(scifiFirst + " " + scifiLast + " of the planet: " + scifiOrigin + ".");
            }
        });

        //button that guides the user back to the menu (hopefully this clears up other errors)
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SciFi.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}