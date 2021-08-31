package com.example.wwtbam_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ActivityQuestionPane extends AppCompatActivity {
    MediaPlayer player;
    WWTBAM_Object wo = new WWTBAM_Object();
    Random rand = new Random();
    int rng = rand.nextInt(50);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        playMusic();

        TextView tvQuestion;
        Button btnTop;
        Button btnTopMiddle;
        Button btnBottomMiddle;
        Button btnBottom;

        tvQuestion = (TextView) findViewById(R.id.tvQuestion);

        btnTop = (Button) findViewById(R.id.btnTop);
        btnTopMiddle = (Button) findViewById(R.id.btnTopMiddle);
        btnBottomMiddle = (Button) findViewById(R.id.btnBottomMiddle);
        btnBottom = (Button) findViewById(R.id.btnBottom);

        tvQuestion.setText(wo.getQuestion(rng));

        btnTop.setText(wo.getAnswersArray(rng)[0]);
        btnTopMiddle.setText(wo.getAnswersArray(rng)[1]);
        btnBottomMiddle.setText(wo.getAnswersArray(rng)[2]);
        btnBottom.setText(wo.getAnswersArray(rng)[3]);

        String check = wo.getAnswersArray(rng)[wo.getIndexOfCorrectAnswer(rng)];

        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTopClick();
            }
        });

        btnTopMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTopMiddleClick();
            }
        });

        btnBottomMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBottomMiddleClick();
            }
        });

        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBottomClick();
            }
        });
    }

    public void btnTopClick() {
        int num = 0;
        intentCheck(num);
    }

    public void btnTopMiddleClick() {
        int num = 1;
        intentCheck(num);
    }

    public void btnBottomMiddleClick() {
        int num = 2;
        intentCheck(num);
    }

    public void btnBottomClick() {
        int num = 3;
        intentCheck(num);
    }

    public void playMusic() {
        player = MediaPlayer.create(this, R.raw.musicquestions);
        player.start();
    }

    public void intentCheck(int i){
        Intent intent;
        if (i == (wo.getIndexOfCorrectAnswer(rng)))
        {
            String val = ActivityMoneyScreen.counterDict.get("@counter"); //calls the static dictionary to get the count
            if (val.equals("15"))
            {
                intent = new Intent(this, ActivityWin.class);
            }//if the count equals the winning round number
            else
            {
                intent = new Intent(this, ActivityMoneyScreen.class);
            }//goes back to the
        }
        else
        {
            finish();//ends the previous activity so you can't go back and keep playing; restarts
            intent = new Intent(this, ActivityLose.class);
        }
        startActivity(intent);
        player.stop();
    }
}