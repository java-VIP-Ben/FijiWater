package com.example.pizzaplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbCheese = findViewById(R.id.cbCheese);
        CheckBox cbPep = findViewById(R.id.cbPeperoni);
        CheckBox cbSausage = findViewById(R.id.cbSausage);
        TextView txtText = findViewById(R.id.txtText);
        Button btnCheck = findViewById(R.id.btnCheck);
        RadioGroup rbGroup = findViewById(R.id.radioGroup);
        RadioButton rbSmall = findViewById(R.id.rbSmall);
        RadioButton rbMedium = findViewById(R.id.rbMedium);
        RadioButton rbLarge = findViewById(R.id.rbLarge);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String order = "";
                String topping = "";
                if(cbCheese.isChecked()) {
                    txtText.setText("cheese");
                    topping = "cheese";
                } else if (cbPep.isChecked()) {
                    txtText.setText("peperoni");
                    topping = "peperoni";
                } else if(cbSausage.isChecked()) {
                    txtText.setText("sausage");
                    topping = "sausage";
                } else {
                    txtText.setText("You have not made a selection.");
                }

                if(rbSmall.isChecked()) {
                    order = "Small "  +  topping + " pizza";
                    //make text(in which activity, the message, short or long).show it();
                    Toast.makeText(MainActivity.this,order,Toast.LENGTH_LONG).show();
                    Log.d("Pizza Order",order);
                } else if (rbMedium.isChecked()) {
                    order = "Medium " + topping + " pizza";
                    Toast.makeText(MainActivity.this, order, Toast.LENGTH_LONG).show();
                    Log.d("Pizza Order",order);
                } else if(rbLarge.isChecked()) {
                    order = "Large " + topping + " pizza";
                    Toast.makeText(MainActivity.this,order,Toast.LENGTH_LONG).show();
                    Log.d("Pizza Order",order);
                } else {
                    txtText.setText("You have not made a topping selection.");
                }

            }
        });

    }
}