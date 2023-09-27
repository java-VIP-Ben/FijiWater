package com.example.helloandroid;
//DO NOT SCREW WITH THE PACKAGE. WITHOUT THE PACKAGE, android studio will not be able to recognize the files for the project.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


//public for all files to access it.
//class -> defining a class for the JVM
//MainActivity -> this is where your entire app starts
//extends AppCompatActivity -> DO NOT TOUCH... this is the library to connect the Java to XML

public class MainActivity extends AppCompatActivity {
    //This overrides the onCreate method in AppCompatActivity -> this runs on startup.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //creating a function or method for the button to do something
    public void sayHello(View V) {
        //View V is an object of the view class which assists the button to find this function
        //This goes back to the model view controller setup or Game Loop in Love2D
        //v will now allow the XML to see the function
        //you MUST do this for using an onClick

        //obtain the info from widgets
        EditText userInput = findViewById(R.id.editTextText);
        TextView greetingText = findViewById(R.id.outputTextView);

        //output something to the outputTextView
        greetingText.setText("Hi " + userInput.getText() + " Nice to meet you!");

    }
}