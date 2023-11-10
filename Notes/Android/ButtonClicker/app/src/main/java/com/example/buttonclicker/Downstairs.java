package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class Downstairs extends AppCompatActivity {

    private Button run;
    private Button btnConverse;
    private TextView dialogue;
    private EditText txttalking;
    private String answer, name, lastName;

    boolean q1, q2, q3, q4, q5, here, died;
    ArrayList<String> info = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downstairs);

        run = findViewById(R.id.btnRun);
        btnConverse = findViewById(R.id.btnRespond);
        txttalking = findViewById(R.id.txtConverse);
        dialogue = findViewById(R.id.txtDialogue);

        //conversation (if you've been here before, it should be different)
        if (here) {
            completed();
        } else {
            q1();
            q1 = true;
        }


        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Downstairs.this, home.class);
                startActivity(i);
            }
        });

        btnConverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(q1){
                    answer = String.valueOf(txttalking.getText());
                    if (answer.equals("no") || answer.equals("N") || answer.equals("n")) {
                        q2 = true;
                        q1 = false;
                    } else {
                        died();
                    }
                    txttalking.setText("");
                }

                //starting the second question (hopefully this works) (crossing fingers and toes)
                if(q2) {
                    q2();
                    answer = String.valueOf(txttalking.getText());
                    if(answer.equals("yes") || answer.equals("Y") || answer.equals("y")) {
                        q2 = false;
                        q3 = true;
                    } else {
                        dialogue.setText("That does not make much sense, what are you trying to say?");
                        q2();
                        q2 = true;
                    }
                    txttalking.setText("");
                }

                if(q3) {
                    q3();
                    name = String.valueOf(txttalking.getText());
                    if(name.isEmpty()) {
                        dialogue.setText("be sure to enter a name.");
                        q3();
                        q3 = true;
                    } else {
                        info.add(name);
                        q4();
                        q4 = true;
                        q3 = false;
                    }
                    txttalking.setText("");
                }

                if(q4) {
                    q4();
                    lastName = String.valueOf(txttalking.getText());
                    if(lastName.isEmpty()) {
                        dialogue.setText("Hey, I asked you your name! Are we going to have a problem?");
                        q4();
                        q4 = true;
                    } else {
                        info.add(lastName);
                        q5 = true;
                        q4 = false;
                    }
                    txttalking.setText("");
                }

                if(q5) {
                    q5();
                    if(answer.equals("no") || answer.equals("N") || answer.equals("n")) {
                        died();
                    } else {
                        here = true;
                        if(answer.isEmpty()) {
                            dialogue.setText("GIVE ME YOUR SOCIAL SECURITY NUMBER.");
                            q5();
                        } else {
                            Intent i = new Intent(Downstairs.this, Butterfly.class);
                            i.putExtra("firstName" , name);
                            i.putExtra("lastName" , lastName);
                            startActivity(i);
                        }
                    }
                }
            }
        });
    }

    private void completed() {
        dialogue.setText("Say, I know you! Did you ever get that milk yet?");
    }
    private void died() {
        Intent i = new Intent(Downstairs.this, Railing.class);
        if(name.isEmpty()) {
            name = "We're done.";
        } else {
            i.putExtra("firstName" , name);
        }

        if(lastName.isEmpty()) {
            lastName = " ";
        } else {
            i.putExtra("lastName" , lastName);
        }
        startActivity(i);
    }
    private void q1(){
        //these next pieces are cut from onClick events that didnt work prior.
        //Neighbor approaches you and grabs your arm
        //this sets the initial conversation for talking to the not so friendly neighbor, which you might see later.
        dialogue.setText("Watch where you are going, you do not want to go over the side do you? (Y/N)");

        //ask a series of questions that use the same text view and button
        //make sure different responses do not change the answers of the prior questions
        //use one variable (not hard coded) to create the answers and a way to gather information to fill the array list

        //toasting again
        Toast.makeText(getApplicationContext(), "conversation started", Toast.LENGTH_SHORT).show();
    }
    private void q2() {
        dialogue.setText("Yes I had figured as much. Say, you live upstairs don't you?");
    }
    private void q3() {
        dialogue.setText("Well, while we are here, I figure I should know all of your personal information! \n What is your first name?");
    }
    private void q4() {
        String nameT = String.format("%s , hmm . . . That does not sound familiar, maybe a last name?", name);
        dialogue.setText(nameT);
    }
    private void q5() {
        String nameL = String.format("%s , no. It does not appear that I have ever known of you. What is your Social Security Number? \n \n \tThis is not optional.", lastName);
        dialogue.setText(nameL);
    }
}
