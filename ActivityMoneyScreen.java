package com.example.wwtbam_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class ActivityMoneyScreen extends AppCompatActivity {
    MediaPlayer player;
    int counter;
    public static Map<String, String> counterDict = new HashMap<String, String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);
        ImageView roundImage;
        roundImage = (ImageView) findViewById(R.id.roundImage);
        playMusic();

        SharedPreferences pref = this.getSharedPreferences("Share", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = pref.edit();
        int count = pref.getInt("counter", 1); //0 is default value.


        switch (count) {
            case 1:
                roundImage.setImageResource(R.drawable.a01);
                updateCounter(count, edit);
                break;
            case 2:
                roundImage.setImageResource(R.drawable.a02);
                updateCounter(count, edit);
                break;
            case 3:
                roundImage.setImageResource(R.drawable.a03);
                updateCounter(count, edit);
                break;
            case 4:
                roundImage.setImageResource(R.drawable.a04);
                updateCounter(count, edit);
                break;
            case 5:
                roundImage.setImageResource(R.drawable.a05);
                updateCounter(count, edit);
                break;
            case 6:
                roundImage.setImageResource(R.drawable.a06);
                updateCounter(count, edit);
                break;
            case 7:
                roundImage.setImageResource(R.drawable.a07);
                updateCounter(count, edit);
                break;
            case 8:
                roundImage.setImageResource(R.drawable.a08);
                updateCounter(count, edit);
                break;
            case 9:
                roundImage.setImageResource(R.drawable.a09);
                updateCounter(count, edit);
                break;
            case 10:
                roundImage.setImageResource(R.drawable.a10);
                updateCounter(count, edit);
                break;
            case 11:
                roundImage.setImageResource(R.drawable.a11);
                updateCounter(count, edit);
                break;
            case 12:
                roundImage.setImageResource(R.drawable.a12);
                updateCounter(count, edit);
                break;
            case 13:
                roundImage.setImageResource(R.drawable.a13);
                updateCounter(count, edit);
                break;
            case 14:
                roundImage.setImageResource(R.drawable.a14);
                updateCounter(count, edit);
                break;
            case 15:
                roundImage.setImageResource(R.drawable.a15);
                updateCounter(count, edit);
                break;
        }//this sets the image and updates the round number

        Button btnContinue;
        btnContinue = (Button) findViewById(R.id.btnContinue);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnContinueClick();
                player.stop();
            }
        });
    }

    public void updateCounter(int count, SharedPreferences.Editor edit){
        counterDict.put("@counter", String.valueOf(count));
        count++;
        edit.putInt("counter", count);
        edit.commit();
    }//dictionary function that passes data between activities

    public void btnContinueClick() {
        Intent intent = new Intent(this, ActivityQuestionPane.class);
        startActivity(intent);
    }//opens the bird activity on login

    public void playMusic() {
        player = MediaPlayer.create(this, R.raw.musiclightsdown);
        player.start();
    }//this plays the round start music

}