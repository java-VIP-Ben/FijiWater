package com.example.lifecyclenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    private TextView text;

    private void showLog(String text) {
        //logging all of our information
        Log.d("LifeCycleExample", text);

        //Log d -> debug
        //Log e -> error
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //logging all of our information
        showLog("onCreate fired");

        //Log d -> debug
        //Log e -> error
        Toast.makeText(this, "onCreate fired", Toast.LENGTH_SHORT).show();

        button = findViewById(R.id.btnButton);
        text = findViewById(R.id.editTextText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Wompwomp.class);
                i.putExtra("input", String.valueOf(text.getText()));
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        showLog("onStart fired");
        Toast.makeText(this, "onStart fired", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        showLog("onResume fired");
        Toast.makeText(this, "onResume fired", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        showLog("onPause fired");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("onStop fired");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showLog("onRestart fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("onDestroy fired");
    }
}