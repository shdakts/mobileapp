package com.example.suheda.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main6Activity extends AppCompatActivity {

    ImageButton i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        i1=(ImageButton)findViewById(R.id.imageButton);
        i2=(ImageButton)findViewById(R.id.imageButton2);
        i3=(ImageButton)findViewById(R.id.imageButton3);
        i4=(ImageButton)findViewById(R.id.imageButton4);
        i5=(ImageButton)findViewById(R.id.imageButton5);
        i6=(ImageButton)findViewById(R.id.imageButton6);
        i7=(ImageButton)findViewById(R.id.imageButton7);
        i8=(ImageButton)findViewById(R.id.imageButton8);
        i9=(ImageButton)findViewById(R.id.imageButton9);
        i10=(ImageButton)findViewById(R.id.imageButton10);

        final MediaPlayer mediaPlayer=MediaPlayer.create(Main6Activity.this,R.raw.fr_1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        final MediaPlayer mediaPlayer2=MediaPlayer.create(Main6Activity.this,R.raw.fr_2);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        final MediaPlayer mediaPlayer3=MediaPlayer.create(Main6Activity.this,R.raw.fr_3);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        final MediaPlayer mediaPlayer4=MediaPlayer.create(Main6Activity.this,R.raw.fr_4);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        final MediaPlayer mediaPlayer5=MediaPlayer.create(Main6Activity.this,R.raw.fr_5);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        final MediaPlayer mediaPlayer6=MediaPlayer.create(Main6Activity.this,R.raw.fr_6);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        final MediaPlayer mediaPlayer7=MediaPlayer.create(Main6Activity.this,R.raw.fr_7);
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        final MediaPlayer mediaPlayer8=MediaPlayer.create(Main6Activity.this,R.raw.fr_8);
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });
        final MediaPlayer mediaPlayer9=MediaPlayer.create(Main6Activity.this,R.raw.fr_9);
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();
            }
        });
        final MediaPlayer mediaPlayer10=MediaPlayer.create(Main6Activity.this,R.raw.fr_10);
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer10.start();
            }
        });
    }



}
