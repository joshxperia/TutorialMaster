package com.example.tutorialmaster;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class activity_grid_item extends AppCompatActivity implements View.OnTouchListener,View.OnLongClickListener{

    TextView tv1,tv2,tv3,tv4;
    RelativeLayout r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        tv1 = (TextView) findViewById(R.id.text1);
        tv2 = (TextView) findViewById(R.id.text2);
        tv3 = (TextView) findViewById(R.id.text3);
        tv4 = (TextView) findViewById(R.id.text4);

        r1 = (RelativeLayout) findViewById(R.id.rel1);
        r2 = (RelativeLayout) findViewById(R.id.rel2);
        r3 = (RelativeLayout) findViewById(R.id.rel3);
        r4 = (RelativeLayout) findViewById(R.id.rel4);

        RelativeLayout r = (RelativeLayout) findViewById(R.id.r10);
        r.setOnTouchListener(this);
        r.setOnLongClickListener(this);



        r1.setOnLongClickListener(this);
        r2.setOnLongClickListener(this);
        r3.setOnLongClickListener(this);
        r4.setOnLongClickListener(this);


        r1.setOnTouchListener(this);
        r2.setOnTouchListener(this);
        r3.setOnTouchListener(this);
        r4.setOnTouchListener(this);




    }

    @Override
    public boolean onLongClick(View v) {

        switch (v.getId()) {
            case R.id.rel1:
                Intent intent=new Intent(activity_grid_item.this,Home.class);
                startActivity(intent);
                break;
            case R.id.rel2:
                Intent intent2=new Intent(activity_grid_item.this,Home.class);
                startActivity(intent2);

                break;
            case R.id.rel3:
                Intent intent3=new Intent(activity_grid_item.this,Home.class);
                startActivity(intent3);

                break;
            case R.id.rel4:
                Intent intent4=new Intent(activity_grid_item.this,Home.class);
                startActivity(intent4);

                break;

        }
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            case R.id.rel1:
                Intent intent=new Intent(activity_grid_item.this,Home.class);
                startActivity(intent);
                break;
            case R.id.rel2:
                Intent intent2=new Intent(activity_grid_item.this,Home.class);
                startActivity(intent2);

                break;
            case R.id.rel3:
                Intent intent3=new Intent(activity_grid_item.this,Home.class);
                startActivity(intent3);

                break;
            case R.id.rel4:
                Intent intent4=new Intent(activity_grid_item.this,Home.class);
                startActivity(intent4);

                break;

        }

        return false;
    }
}
