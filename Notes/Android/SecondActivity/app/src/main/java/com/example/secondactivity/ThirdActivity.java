package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private Button third;
    private EditText thirdInformation;

    private TextView tLabel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //step 2: connect the java obj with the widgets
        third = findViewById(R.id.btnThird);
        thirdInformation = findViewById(R.id.txtThirdUI);
        tLabel = findViewById(R.id.lblThird);

        //widget.setText(intentFile.getStringValue("Keyword"));
        thirdInformation.setText(getIntent().getStringExtra("second user input"));

        //step 3, setting up an onclick listener
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step3b: setting up my intent
                //IntentClass objName = new IntentConstructor(Activity you're running, the activity you're going to);
                Intent i = new Intent(ThirdActivity.this, MainActivity.class);


                //step 5: go to new activity
                startActivity(i);
            }
        });
    }
}