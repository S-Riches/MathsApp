package com.example.mathsapp;

//imports
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    // This is the main method?
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // defines the level 0 button
        Button level0 = (Button) findViewById(R.id.level0);
        // create a click listener
        level0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), Level0.class);
                startActivity(startIntent);
            }
        });
    }

}
