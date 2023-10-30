package com.example.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    //global variables
    private Button second;
    private EditText secondInformation;

    private TextView title;


    //this totally might not work, I just put this in based off of what is on the board.
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //step 2: connect the java obj with the widgets
        second = findViewById(R.id.btnSecond);
        secondInformation = findViewById(R.id.txtSecondUI);
        title = findViewById(R.id.lblSecond);
        String data = getIntent().getStringExtra("user input");
        secondInformation.setText(data);

        //step 3, setting up an onclick listener
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step3b: setting up my intent
                //IntentClass objName = new IntentConstructor(Activity you're running, the activity you're going to);
                Intent i = new Intent(SecondActivity.this, ThirdActivity.class);

                //Step 4: getting the information from the intent "cache file"
                //widget.setText(intentFile.getStringValue("Keyword"));
                i.putExtra("second user input", String.valueOf(secondInformation.getText()) + " " + data); // + data is not actually needed, the field is getting filled that is being updated all the time.

                //step 5: go to new activity
                startActivity(i);
            }
        });
    }
}
