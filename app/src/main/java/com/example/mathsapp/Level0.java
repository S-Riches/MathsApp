package com.example.mathsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;


public class Level0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level0);

        Button Question = (Button) findViewById(R.id.Debug);
        TextView QuestionDisplay = (TextView) findViewById(R.id.textView);

        // declared two numbers to hold the value of the question numbers
        int numberOne = 0;
        int numberTwo = 0;

        Question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // declared two numbers to hold the value of the question numbers
                Random r = new Random();
                // create two random numbers between 1 and 12
                int numberOne = r.nextInt(11)+1;
                int numberTwo = r.nextInt(11)+1;

                QuestionDisplay.setText(numberOne + numberTwo);
            }
        });
    }
}