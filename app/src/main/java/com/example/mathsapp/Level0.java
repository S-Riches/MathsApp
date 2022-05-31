package com.example.mathsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;


public class Level0 extends AppCompatActivity {
    public Button Question;
    public TextView QuestionDisplay;
    public Button Answer1, Answer2, Answer3, Answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level0);
        // create reference to the objects in the activity
        Question = (Button) findViewById(R.id.Debug);
        QuestionDisplay = (TextView) findViewById(R.id.txt_viewer);
        Answer1 = (Button) findViewById(R.id.answer1);
        Answer2 = (Button) findViewById(R.id.answer2);
        Answer3 = (Button) findViewById(R.id.answer3);
        Answer3 = (Button) findViewById(R.id.answer4);
        Question.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                // declared two numbers to hold the value of the question numbers
                Random r = new Random();
                // create two random numbers between 1 and 12
                int numberOne = r.nextInt(11) + 1;
                int numberTwo = r.nextInt(11) + 1;
                int selector = r.nextInt(4) + 1;
                // declare 4 numbers for the answers
                int answerOne = 0, answerTwo = 0, answerThree = 0, answerFour = 0;
                // need to convert to string to display ints to the screen and not crash the app.
                QuestionDisplay.setText(String.valueOf(numberOne) + " + " + String.valueOf(numberTwo));

                //switch statement to make the answer be a random button each time
                switch (selector){
                    case 1:
                        answerOne = numberOne + numberTwo;
                        answerTwo = r.nextInt(23) + 1;
                        answerThree = r.nextInt(23) + 1;
                        answerFour = r.nextInt(23) + 1;
                        break;
                    case 2:
                        answerTwo = numberOne + numberTwo;
                        answerOne = r.nextInt(23) + 1;
                        answerThree = r.nextInt(23) + 1;
                        answerFour = r.nextInt(23) + 1;
                        break;
                    case 3:
                        answerThree = numberOne + numberTwo;
                        answerTwo = r.nextInt(23) + 1;
                        answerOne = r.nextInt(23) + 1;
                        answerFour = r.nextInt(23) + 1;
                        break;
                    case 4:
                        answerFour = numberOne + numberTwo;
                        answerTwo = r.nextInt(23) + 1;
                        answerOne = r.nextInt(23) + 1;
                        answerThree = r.nextInt(23) + 1;
                        break;

                }
                Answer1.setText(String.valueOf(answerOne));
                Answer2.setText(String.valueOf(answerTwo));
                Answer3.setText(String.valueOf(answerThree));
                Answer4.setText(String.valueOf(answerFour));
            }
        });

    }
}