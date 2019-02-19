package com.example.tutorialmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

    public class MainActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            Thread xyz=new Thread()
            {
                @Override
                public void run() {
                    try{
                        sleep(3000);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    finally {
                        Intent intent=new Intent(MainActivity.this,Home.class);
                        startActivity(intent);
                    }
                }
            };
            xyz.start();
        }

        @Override
        protected void onPause(){
            super.onPause();
            finish();
        }
    }

