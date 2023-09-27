package com.example.madlibs;

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


        EditText noun1 = findViewById(R.id.noun1txt);
        EditText verb1 = findViewById(R.id.verb1txt);
        EditText adj1 = findViewById(R.id.adjective1txt);
        EditText noun2 = findViewById(R.id.noun2txt);
        EditText verb2 = findViewById(R.id.verb2txt);
        EditText adverb1 = findViewById(R.id.adverb1txt);
        EditText adj2 = findViewById(R.id.adjective2txt);
        EditText noun3 = findViewById(R.id.noun3txt);
        Button btnRand = findViewById(R.id.btnRandomize);
        Button btnMadLib1 = findViewById(R.id.btnLib1);
        Button btnMadLib2 = findViewById(R.id.btnLib2);
        Button btnMadLib3 = findViewById(R.id.btnLib3);
        TextView madlib1 = findViewById(R.id.madlib1);
        TextView madlib2 = findViewById(R.id.madlib2);
        TextView madlib3 = findViewById(R.id.madlib3);


        btnRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randy = new Random();
                int lib = randy.nextInt(3) + 1;

                String fnoun = String.valueOf(noun1.getText());
                String fverb = String.valueOf(verb1.getText());
                String fadj = String.valueOf(adj1.getText());
                String snoun = String.valueOf(noun2.getText());
                String sverb = String.valueOf(verb2.getText());
                String fadverb = String.valueOf(adverb1.getText());
                String sadj = String.valueOf(adj2.getText());
                String tnoun = String.valueOf(noun3.getText());

                if(lib == 1) {
                    madlib2.setVisibility(View.GONE);
                    madlib3.setVisibility(View.GONE);
                    madlib1.setVisibility(View.VISIBLE);
                    madlib1.setText("Quick! The " + fnoun + " is " + fverb + " from the police! We are going to need " + fadj + " to catch the criminal before it can play kickball with infant puppies. \n Quick, hop into the " + snoun + " and go catch the criminal! \n Later: \n Thanks for your " + fadverb + " " + sverb + ", we were able to capture that " + sadj + " " + tnoun + " and prevent him from hurting the puppies!");
                } else if (lib == 2) {
                    madlib1.setVisibility(View.GONE);
                    madlib3.setVisibility(View.GONE);
                    madlib2.setVisibility(View.VISIBLE);
                    madlib2.setText("Ready for your first " + fnoun + " trip? We are going to " + fverb + " today during the " + fadj + " " + snoun + " and see who is the best at it! \n Later: \n Congrats on your " + fadverb + " " + sverb + " skills, you rocked that game! Next up we have a super fun game called " + sadj + " " + tnoun + " and the other players want their champion. Lets go!");
                } else {
                    madlib1.setVisibility(View.GONE);
                    madlib2.setVisibility(View.GONE);
                    madlib3.setVisibility(View.VISIBLE);
                    madlib3.setText("Shhhh, be quiet. " + fnoun + " is following us and we have to get away. Quick! " + fverb + " to the clearing in the field, I'll meet up with you later. " + fadj + " " + snoun + " are the bets for defending yourself from them. \n Later: \n Phew, we made it, those things are " + fadverb + " " + sverb + " , and we barely escaped it.  Glad you managed to seek shelter in that " + sadj + " " + tnoun + " , because that thing did not see you at all! Guess we better head back to camp and tell the others to get out of the forests.");
                }
            }
        });

        btnMadLib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnoun = String.valueOf(noun1.getText());
                String fverb = String.valueOf(verb1.getText());
                String fadj = String.valueOf(adj1.getText());
                String snoun = String.valueOf(noun2.getText());
                String sverb = String.valueOf(verb2.getText());
                String fadverb = String.valueOf(adverb1.getText());
                String sadj = String.valueOf(adj2.getText());
                String tnoun = String.valueOf(noun3.getText());

                madlib2.setVisibility(View.GONE);
                madlib3.setVisibility(View.GONE);
                madlib1.setVisibility(View.VISIBLE);
                madlib1.setText("Quick! The " + fnoun + " is " + fverb + " from the police! We are going to need " + fadj + " to catch the criminal before it can play kickball with infant puppies. \n Quick, hop into the " + snoun + " and go catch the criminal! \n Later: \n Thanks for your " + fadverb + " " + sverb + ", we were able to capture that " + sadj + " " + tnoun + " and prevent him from hurting the puppies!");
            }
        });

        btnMadLib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnoun = String.valueOf(noun1.getText());
                String fverb = String.valueOf(verb1.getText());
                String fadj = String.valueOf(adj1.getText());
                String snoun = String.valueOf(noun2.getText());
                String sverb = String.valueOf(verb2.getText());
                String fadverb = String.valueOf(adverb1.getText());
                String sadj = String.valueOf(adj2.getText());
                String tnoun = String.valueOf(noun3.getText());

                madlib1.setVisibility(View.GONE);
                madlib3.setVisibility(View.GONE);
                madlib2.setVisibility(View.VISIBLE);
                madlib2.setText("Ready for your first " s+ fnoun + " trip? We are going to " + fverb + " today during the " + fadj + " " + snoun + " and see who is the best at it! \n Later: \n Congrats on your " + fadverb + " " + sverb + " skills, you rocked that game! Next up we have a super fun game called " + sadj + " " + tnoun + " and the other players want their champion. Lets go!");
            }
        });

        btnMadLib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnoun = String.valueOf(noun1.getText());
                String fverb = String.valueOf(verb1.getText());
                String fadj = String.valueOf(adj1.getText());
                String snoun = String.valueOf(noun2.getText());
                String sverb = String.valueOf(verb2.getText());
                String fadverb = String.valueOf(adverb1.getText());
                String sadj = String.valueOf(adj2.getText());
                String tnoun = String.valueOf(noun3.getText());

                madlib2.setVisibility(View.GONE);
                madlib1.setVisibility(View.GONE);
                madlib3.setVisibility(View.VISIBLE);
                madlib3.setText("Shhhh, be quiet. " + fnoun + " is following us and we have to get away. Quick! " + fverb + " to the clearing in the field, I'll meet up with you later. " + fadj + " " + snoun + " are the bets for defending yourself from them. \n Later: \n Phew, we made it, those things are " + fadverb + " " + sverb + " , and we barely escaped it.  Glad you managed to seek shelter in that " + sadj + " " + tnoun + " , because that thing did not see you at all! Guess we better head back to camp and tell the others to get out of the forests.");

            }
        });
    }
}