package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //step 1
    //creating global variables
    private Button first;

    private EditText firstInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 2: connect the java obj with the widgets
        first = findViewById(R.id.btnFirst);
        firstInformation = findViewById(R.id.txtFirstUI);

        //step 3, setting up an onclick listener
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step3b: setting up my intent
                //IntentClass objName = new IntentConstructor(Activity you're running, the activity you're going to);
                Intent i = new Intent(MainActivity.this, SecondActivity.class);

                //Step 4: this is for implicit, or passing data
                i.putExtra("user input" , String.valueOf(firstInformation.getText()));

                //step 5: go to new activity
                startActivity(i);
            }
        });

    }
}