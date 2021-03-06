package com.example.mathsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View.*;


public class Level0 extends AppCompatActivity {
    // declarations
    public TextView QuestionDisplay;
    public Button Answer1;
    public Button Answer2;
    public Button Answer3;
    public Button Answer4;
    public TextView Score;
    public int totalScore;
    public Question[] questionArr = new Question[10];
    public int count;

    // change button method
    public void changeButtons(Question q, int totalScore) {
        // decrement the count of the questions to go to the next question
        count--;
        // change the text and values of the buttons, score and questions
        QuestionDisplay.setText(String.valueOf(q.number1 + q.operator + q.number2));
        Answer1.setText(String.valueOf(q.answer1));
        Answer2.setText(String.valueOf(q.answer2));
        Answer3.setText(String.valueOf(q.answer3));
        Answer4.setText(String.valueOf(q.answer4));
        Score.setText("You have Scored " + String.valueOf(totalScore) + " out of 10");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level0);
        // create a media player
        MediaPlayer mp = MediaPlayer.create(this, R.raw.ding);
        MediaPlayer mpLost = MediaPlayer.create(this, R.raw.fail);

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

        //initially populate the buttons
        changeButtons(questionArr[count], totalScore);

        // create 4 onclick listeners
        Answer1.setOnClickListener(new OnClickListener() {
            @Override
            // when clicked
            public void onClick(View view) {
                // if the text in the button matches that of the questions answer
                if (Answer1.getText() == String.valueOf(questionArr[count + 1].answer)) {
                    // play a good sound
                    mp.start();
                    // add one to the score
                    totalScore += 1;
                    // change the buttons to the next question
                    changeButtons(questionArr[count], totalScore);
                } else {
                    // play the lost sound
                    mpLost.start();
                    // change the buttons to the next question
                    changeButtons(questionArr[count], totalScore);
                }
            }
        });
        Answer2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Answer2.getText() == String.valueOf(questionArr[count + 1].answer)) {
                    // play the sound
                    mp.start();
                    // increment the score
                    totalScore += 1;
                    changeButtons(questionArr[count], totalScore);
                } else {
                    mpLost.start();
                    changeButtons(questionArr[count], totalScore);
                }
            }
        });
        Answer3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Answer3.getText() == String.valueOf(questionArr[count + 1].answer)) {
                    mp.start();
                    totalScore += 1;
                    changeButtons(questionArr[count], totalScore);
                } else {
                    mpLost.start();
                    changeButtons(questionArr[count], totalScore);
                }
            }
        });
        Answer4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Answer4.getText() == String.valueOf(questionArr[count + 1].answer)) {
                    mp.start();
                    totalScore += 1;
                    changeButtons(questionArr[count], totalScore);
                } else {
                    mpLost.start();
                    changeButtons(questionArr[count], totalScore);
                }
            }
        });
    }
}


