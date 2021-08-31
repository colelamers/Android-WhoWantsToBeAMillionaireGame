package com.example.wwtbam_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityWin extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button restart;
        playMusic();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        Button btnContinue;
        btnContinue = (Button) findViewById(R.id.btnRestart);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRestartClick();
                player.stop();
            }
        });
    }

    public void btnRestartClick() {
        Intent intent = new Intent(this, Activity0Start.class);
        startActivity(intent);
    }

    public void playMusic() {
        player = MediaPlayer.create(this, R.raw.musicwin);
        player.start();
    }
}