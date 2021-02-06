package com.example.suheda.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {

    Button btn,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        btn=(Button)findViewById(R.id.oynat);
        btn2=(Button)findViewById(R.id.sonraki);

        final MediaPlayer mediaPlayer11=MediaPlayer.create(Main7Activity.this,R.raw.fr_konusma);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer11.stop();
                Intent intent= new Intent(Main7Activity.this,Main8Activity.class);
                startActivity(intent);
            }
        });
    }
}
