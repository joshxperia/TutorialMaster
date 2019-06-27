package com.example.tutorialmaster;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

public class Home extends AppCompatActivity {

    private VideoView videoView;
    private ImageView btn_play_pause;
    private TextView currentTimer;
    private TextView durationTimer;
    private ProgressBar currentProgress;
    private ProgressBar bufferProgress;
    private boolean isPlaying;
    private Uri videoUri;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isPlaying =false;

        videoView = (VideoView) findViewById(R.id.videoView);
        btn_play_pause = (ImageView) findViewById(R.id.btn_play_pause);
        currentProgress = (ProgressBar) findViewById(R.id.currentProgress);
        currentTimer = (TextView) findViewById(R.id.currentTimer);
        //durationTimer = (TextView) findViewById(R.id.durationTimer);
        bufferProgress = (ProgressBar) findViewById(R.id.bufferprogress);

        videoUri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/tutorialmaster-dae5a.appspot.com/o/Tech%20Tips%2FReact%20JS%20Crash%20Course.mp4?alt=media&token=ae36374d-f154-4669-972b-0d79d0d1c1f9");
        videoView.setVideoURI(videoUri);
        videoView.requestFocus();
        videoView.start();
        isPlaying = true;
        btn_play_pause.setImageResource(R.drawable.ic_play);
        btn_play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isPlaying){

                    videoView.pause();
                    isPlaying =false;
                    btn_play_pause.setImageResource(R.drawable.ic_play);
                } else {
                    videoView.start();
                    isPlaying =true;
                    btn_play_pause.setImageResource(R.drawable.ic_play);
                }


            }
        });


    }


}

