package com.example.mathsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Level3 extends AppCompatActivity {
    public TextView QuestionDisplay;
    public Button Answer1;
    public Button Answer2;
    public Button Answer3;
    public Button Answer4;
    public TextView Score;
    public int totalScore;
    public Question[] questionArr = new Question[10];
    public int count;
    public ProgressBar timerBar;
    public CountDownTimer countTime;
    public int timerLength;
    int i = 0;

    public void timer(int timerLength){
        // iterator
        i = 0;
        // check if there is already a timer active otherwise these will overlap
        if(countTime != null){
            // cancel the existing timer
            countTime.cancel();
        }
        countTime = new CountDownTimer((long)timerLength * 1000, 1000){
            @Override
            public void onTick(long millisUntilFinished){
                // increment i
                i++;
                // increase the progress of the progress bar
                timerBar.setProgress((int)i*100/timerLength);
                // if full switch question
                if(timerBar.getProgress() == 100){
                    countTime.cancel();
                    changeButtons(questionArr[count], totalScore);
                }
            }
            // change question on finish
            public void onFinish(){
                // blank statement
            }
            // start the timer
        }.start();

    }
    public void changeButtons(Question q, int totalScore) {
        // run the timer function
        timer(10);
        // decrement the list
        count--;
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
        setContentView(R.layout.activity_level3);
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
        timerBar = (ProgressBar) findViewById(R.id.progressBar);

        //initially populate the buttons
        changeButtons(questionArr[count], totalScore);

        Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Answer1.getText() == String.valueOf(questionArr[count + 1].answer)) {
                    mp.start();
                    totalScore += 1;
                    changeButtons(questionArr[count], totalScore);
                } else {
                    mpLost.start();
                    changeButtons(questionArr[count], totalScore);
                }
            }
        });
        Answer2.setOnClickListener(new View.OnClickListener() {
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
        Answer3.setOnClickListener(new View.OnClickListener() {
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
        Answer4.setOnClickListener(new View.OnClickListener() {
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