package com.example.mathsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View.*;

import java.util.*;

public class Level0 extends AppCompatActivity {
    public TextView QuestionDisplay;
    public Button Answer1;
    public Button Answer2;
    public Button Answer3;
    public Button Answer4;
    public TextView Score;
    int totalScore = 0;
    public Question[] questionArr = new Question[10];
    public int count;

    public void changeButtons(Question q) {
        count--;
        QuestionDisplay.setText(String.valueOf(q.number1 + q.operator + q.number2));
        Answer1.setText(String.valueOf(q.answer1));
        Answer2.setText(String.valueOf(q.answer2));
        Answer3.setText(String.valueOf(q.answer3));
        Answer4.setText(String.valueOf(q.answer4));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level0);

        // fill the question array with questions.
        for (int i = 0; i < 10; i++) {
            questionArr[i] = new Question();
        }
        //create a variable to index the array.
        count = questionArr.length - 1;

        // create reference to the objects in the activity
        QuestionDisplay = (TextView) findViewById(R.id.txt_viewer);
        Score = (TextView) findViewById(R.id.Score);
        Answer1 = (Button) findViewById(R.id.answer1);
        Answer2 = (Button) findViewById(R.id.answer2);
        Answer3 = (Button) findViewById(R.id.answer3);
        Answer4 = (Button) findViewById(R.id.answer4);

        QuestionDisplay.setText(String.valueOf(questionArr[count].number1 + questionArr[count].operator + questionArr[count].number2));
        Answer1.setText(String.valueOf(questionArr[count].answer1));
        Answer2.setText(String.valueOf(questionArr[count].answer2));
        Answer3.setText(String.valueOf(questionArr[count].answer3));
        Answer4.setText(String.valueOf(questionArr[count].answer4));


        Answer1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Answer1.getText() == String.valueOf(questionArr[count].answer)) {
                    totalScore += 1;
                    Score.setText(String.valueOf(totalScore));
                    changeButtons(questionArr[count]);

                } else {
                    changeButtons(questionArr[count]);
                }
            }
        });
        Answer2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Answer2.getText() == String.valueOf(questionArr[count].answer)) {
                    totalScore += 1;
                    Score.setText(String.valueOf(totalScore));
                    changeButtons(questionArr[count]);
                } else {
                    changeButtons(questionArr[count]);
                }
            }
        });
        Answer3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Answer3.getText() == String.valueOf(questionArr[count].answer)) {
                    totalScore += 1;
                    Score.setText(String.valueOf(totalScore));
                    changeButtons(questionArr[count]);
                } else {
                    changeButtons(questionArr[count]);
                }
            }
        });
        Answer4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Answer4.getText() == String.valueOf(questionArr[count].answer)) {
                    totalScore += 1;
                    Score.setText(String.valueOf(totalScore));
                    changeButtons(questionArr[count]);
                } else {
                    changeButtons(questionArr[count]);
                }
            }
        });
    }
}


