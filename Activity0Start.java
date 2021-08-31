package com.example.wwtbam_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Activity0Start extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pref = this.getSharedPreferences("Share", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = pref.edit();
        edit.putInt("counter", 1);
        edit.commit();//this slice of code resets the counter for the Round Screen upon app startup

        playMusic();

        Button btnStart;
        btnStart = (Button) findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnStartClick();
            }
        });
    }

    public void btnStartClick() {
        Intent intent = new Intent(this, ActivityMoneyScreen.class);
    startActivity(intent);
    player.stop();
}//opens initial page

    public void playMusic() {
        player = MediaPlayer.create(this, R.raw.musictheme);
        player.start();
    }//plays the music

}
