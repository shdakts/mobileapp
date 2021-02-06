package com.example.suheda.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {

    Button btn3,kapat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        btn3=(Button)findViewById(R.id.dinle);
        kapat=(Button)findViewById(R.id.kapat);
        final MediaPlayer mediaPlayer12=MediaPlayer.create(Main8Activity.this,R.raw.fr_diyalog);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.start();
            }
        });
        kapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer12.stop();
            }
        });

    }
}
