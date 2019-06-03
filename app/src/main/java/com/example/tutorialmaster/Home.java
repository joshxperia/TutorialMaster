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
import android.widget.VideoView;

public class Home extends AppCompatActivity implements View.OnClickListener {

 ProgressDialog mDialog;
 VideoView videoView;
 ImageButton btnPlayPause;

 String videoURL ="https://00e9e64bac5ccc948a596e7cdf44939ecbe4f406175bb64669-apidata.googleusercontent.com/download/storage/v1/b/webtutorials/o/Programing%2FElixir%20Tutorial.MP4?qk=AD5uMEu9HLNqY7FlExOK_sZx26CFv0fAChBMMPSYjnFGmu0FZchh8ZmALNaHm-OCorH_NAWwf6m63wNf5EBYIV6lQITM6ub8DZFYLzzS0H64e_9cjHbulbO1TOMvo0ZcpXbU04lniuH8zej0JCIzHlPJ6yj3hI5gTFaEbvIQ_9EXaPP9JntCUKvokFUlckHIiVD7ADfNNSKLpOYTd2K9R1xL8tLM6PdPjGlTjzochmyvBcN_-Txd8qyxnyLGUOSyTnBbhUm9ktMdGCabIj_XuzuLTeP3reNcRVebgtkYoBRyg0Opmuxj5JncxnXIa8O2W5T-fHZ5FUhzRXZKiXyR_cI2Iu2NtOHR96nqlG1grZP2HaeL67YkhxA_d52pI3phvhupWSrecHVeR_6YAUxBF1_PYNRz2dzEdGpVPhON2lXUgJQor_ZLrU52SZtx7iKGlF3LnNu2PBJF92r509-rVqIyXkcHX90D_DaryBcNCET1Qj9tzM-ruUz-U4vZsM5iQ6-XjMjkl54LIXDGjpvm5Hzb2yGRi_koGYnSWA-m1K2LTO1za_yzeb8ml5T-zKPC1GPOcVRwK7FJXH1d31Y_S8uEpWGpmOdJ8Z2Yu59sJDQvvNxdwYslYd16re0vCBYnNW9e2itrt8XvvzUlVR4VzK25iH3iaAufxO9yPS5vWnd6OdW9wSGZXvPodXruGWYMrsA_-VP4C_WjXnk-LADR1fwSDXWkiKNFnurR-LmBJpoT4NMRx5E3QpTJbrld-OD4HPQu792zIL1LrEdEBQ_8cH-xOWvpOBl0nSLJYlBatiZ9qb2bI828meE";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView)findViewById(R.id.videoView);
        btnPlayPause = (ImageButton)findViewById(R.id.btn_play_pause);
        btnPlayPause.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        mDialog = new ProgressDialog(Home.this);
        mDialog.setMessage("Please wait...");
        mDialog.setCanceledOnTouchOutside(false);
        mDialog.show();

        try {
            if (!videoView.isPlaying()) {
                Uri uri = Uri.parse(videoURL);
                videoView.setVideoURI(uri);
                videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        btnPlayPause.setImageResource(R.drawable.ic_play);

                    }
                });
            }
            else{
                videoView.pause();
                btnPlayPause.setImageResource(R.drawable.ic_play);
            }
        }

        catch (Exception ex){

        }
        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mDialog.dismiss();
                mp.setLooping(true);
                videoView.start();
                btnPlayPause.setImageResource(R.drawable.ic_launcher_background);
            }
        });
    }
}
