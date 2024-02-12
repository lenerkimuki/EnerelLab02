package com.mobclass.enerellab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView greetingDisplay;
    EditText input;
    int count = 0;
    Button incrementButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] planets = getResources().getStringArray(R.array.planets_array);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.edit_text);

        greetingDisplay = findViewById(R.id.greeting_textview);
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                greetingDisplay.setText("This is what u ");
            }
        });


    }

    public void decrement(View view){
        System.out.println("decrementing: " + --count);
        greetingDisplay.setText("" + count);
    }


}