package com.example.mathsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.reflect.Type;
import java.util.*;


public class Level0 extends AppCompatActivity {
    public Button Question;
    public TextView QuestionDisplay;
    public Button Answer1;
    public Button Answer2;
    public Button Answer3;
    public Button Answer4;
    public TextView Score;
    int count = 9;
    int totalScore = 0;
    Hashtable<Integer, int[]> Questions = new Hashtable<>();

    public void changeButtons(){
        count--;
        QuestionDisplay.setText(String.valueOf(Questions.get(count)[0]) + " + " + String.valueOf(Questions.get(count)[1]));
        Answer1.setText(String.valueOf(Questions.get(count)[2]));
        Answer2.setText(String.valueOf(Questions.get(count)[3]));
        Answer3.setText(String.valueOf(Questions.get(count)[4]));
        Answer4.setText(String.valueOf(Questions.get(count)[5]));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level0);
        // create reference to the objects in the activity
        QuestionDisplay = (TextView) findViewById(R.id.txt_viewer);
        Score = (TextView) findViewById(R.id.Score);
        Answer1 = (Button) findViewById(R.id.answer1);
        Answer2 = (Button) findViewById(R.id.answer2);
        Answer3 = (Button) findViewById(R.id.answer3);
        Answer4 = (Button) findViewById(R.id.answer4);

        for (int i = 0; i < 10; i++){
            // declared two numbers to hold the value of the question numbers
            Random r = new Random();
            // create two random numbers between 1 and 12
            int numberOne = r.nextInt(11) + 1;
            int numberTwo = r.nextInt(11) + 1;
            int selector = r.nextInt(4) + 1;
            // declare 4 numbers for the answers
            int answerOne = 0, answerTwo = 0, answerThree = 0, answerFour = 0;

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
            int[] arr = {numberOne, numberTwo, answerOne, answerTwo, answerThree, answerFour};
            Questions.put(i, arr);
            // need to convert to string to display ints to the screen and not crash the app.
            QuestionDisplay.setText(String.valueOf(numberOne) + " + " + String.valueOf(numberTwo));
            Answer1.setText(String.valueOf(answerOne));
            Answer2.setText(String.valueOf(answerTwo));
            Answer3.setText(String.valueOf(answerThree));
            Answer4.setText(String.valueOf(answerFour));
        }
        Answer1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick (View view){
                if(Answer1.getText() == String.valueOf(Questions.get(count)[0] + Questions.get(count)[1])){
                    totalScore += 10;
                    Score.setText(String.valueOf(totalScore));
                    changeButtons();
                }
            }
        });
        Answer2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick (View view){
                if(Answer2.getText() == String.valueOf(Questions.get(count)[0] + Questions.get(count)[1])){
                    totalScore += 10;
                    Score.setText(String.valueOf(totalScore));
                    changeButtons();

                }
            }
        });
        Answer3.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick (View view){
                if(Answer3.getText() == String.valueOf(Questions.get(count)[0] + Questions.get(count)[1])){
                    totalScore += 10;
                    Score.setText(String.valueOf(totalScore));
                    changeButtons();
                }
            }
        });
        Answer4.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick (View view){
                if(Answer4.getText() == String.valueOf(Questions.get(count)[0] + Questions.get(count)[1])){
                    totalScore += 10;
                    Score.setText(String.valueOf(totalScore));
                    changeButtons();
                }

            }
        });

    }
}