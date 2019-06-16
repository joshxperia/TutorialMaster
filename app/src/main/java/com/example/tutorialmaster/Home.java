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

    private Uri videoUri;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoView);
        btn_play_pause = (ImageView) findViewById(R.id.btn_play_pause);
        currentProgress = (ProgressBar) findViewById(R.id.currentProgress);
        //currentTimer = (TextView) findViewById(R.id.currentTimer);
        //durationTimer = (TextView) findViewById(R.id.durationTimer);

        videoUri = Uri.parse("https://00e9e64bac3d0fceb68036b9b6b3f379428aabd17b44624660-apidata.googleusercontent.com/download/storage/v1/b/webtutorials/o/Programing%2FZero%20to%20Hero%20with%20Python%20Tutorial%20FULL-%20Easy%20Learning%20python%203.4%20from%20begin%20to%20advance.webm?qk=AD5uMEstVZ8QTTplT0_u8UTaZoWauLDMvBwoWOKIT4YAGuY9-w8Dj8N7z9wK4YU0NZErst7Wi2r8QyCNnLnQTLuG-8Kum8CsUCmSgoyajZs_s1EFtSnPfdUyAFeqkVz6VANfuYd295OV78x47piqzgWIHnCmXR-AQacrQNE_7sQXSORaimKHQhvtQasoczufKyO-SBwUQkCP-Al4qatUrW9fI5WtFy7efpQtpBwVQLp3gdhvFvRbwxoDXqNQB6uKinU7w0BvEHLcwyxUMjPCjaipSOr1QrzDqqDYPAUQnL7bPnFwEn3eSEbh97rRbpLLdksIjrRjtGbJQMwaH9Z03HlCx-lr0K-mcdeRI6TjrpXcsT1GMjV81-_C6fesfv5V7Mb7p1MnhVvlFbmeGRbQBdSMh8xWjuuliZi49HmH2-lVnH8bZrgLVYYIEb9X_XM0kAYYyPO0vH2hhD603g9trEcEef3QktVz_2G3bFHsQfiSBe14YDgTe91k68qbzFuNnPnEHh4oxM48ZO1BkL00WxCqMOEovg5sj8QXE2IadAns84qLykeyO8fdMWq2LqoS8c2hdldmxI1Z92ro7tsVD_SM8AtMdLeMWZqhsIdriw3NeNW7uhxOg0WSXMpLAZg0PdOHjKvVLRhtYBzhakP8D_01Xc_f1lt2TwcyXomnoqN2KKKGBOCFXMxSCRpWJO9iAiML1qKiVbgDYhJJPHmySjqvxiQM8L5JwbvtK_gXaD8ZoKRtW9F8GlNfDyaf38RHWFDVzRQNTEJuHPvwjj8jvdKB7ynGDDp-CGi3NQ6IqXpZLKAQwPMj7eJhFGqdb6mXdrixm6OZZQYjM1ej0QITRTWdPGamY3ydPfznJ8jKcV4Zc6A6S-zZL4bDih--q4mHsL0ehtO5Z304UGTkhH158qRbXj7AwvHLqIwnJmBASn4H9WCOQK12FzE");
        videoView.setVideoURI(videoUri);
        videoView.start();

    }


    }

