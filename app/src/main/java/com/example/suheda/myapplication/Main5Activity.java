package com.example.suheda.myapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import static com.google.android.youtube.player.YouTubePlayer.*;

public class Main5Activity extends YouTubeBaseActivity {

    private YouTubePlayerView youTubePlayerView;
    private  YouTubePlayer.OnInitializedListener onInitializedListener;
    Button b;
    Typeface tf1;
    TextView yazi1,yazi2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tf1=Typeface.createFromAsset(getAssets(),"font/yazitipi.ttf");
        yazi1=(TextView)findViewById(R.id.textView6);
        yazi2=(TextView)findViewById(R.id.textView7);
        yazi1.setTypeface(tf1);
        yazi2.setTypeface(tf1);


        youTubePlayerView= (YouTubePlayerView) findViewById(R.id.youtube_view);
        onInitializedListener= new OnInitializedListener() {
            @Override
            public void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("k-inAAlkOwA");
            }

            @Override
            public void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        b=(Button)findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize("AIzaSyAZ5tX4whZbyn2FeU_RsDlPV8UgJtjtGDo", onInitializedListener);
            }
        });


    }

}
