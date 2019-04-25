package com.example.student.lab0201;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class basketball extends AppCompatActivity {
    TextView score;
    Button add3, add2, add1, clear;
    private int mPoint=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
        score = (TextView) findViewById(R.id.score);
        add3 = (Button) findViewById(R.id.add3);
        add2 = (Button) findViewById(R.id.add2);
        add1 = (Button) findViewById(R.id.add1);
        clear = (Button) findViewById(R.id.clear);
    }

    //add 3 points
    public void add3(View v) {
        mPoint+=3;
        String mP=String.valueOf(mPoint);
        score.setText(mP);
    }

    //add 2 points
    public void add2(View v) {
        mPoint+=2;
        String mP=String.valueOf(mPoint);
        score.setText(mP);
    }

    //freethrow add 1 point
    public void add1(View v) {
        mPoint+=1;
        String mP=String.valueOf(mPoint);
        score.setText(mP);
    }

    //clean
    public void clear(View v) {
        //要先讓分數歸0
        mPoint=0;
        score.setText("0");
    }

}