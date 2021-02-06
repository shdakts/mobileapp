package com.example.suheda.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button b3=(Button)findViewById(R.id.renkler);
        Button b4=(Button)findViewById(R.id.sayilar);
        Button b5=(Button)findViewById(R.id.konusma);
        Button b6=(Button)findViewById(R.id.cumle);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Main4Activity.this,Main6Activity.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Main4Activity.this,Main9Activity.class);
                startActivity(intent);
            }
        });

    }

    public void yeni(View v){
        Intent intent= new Intent(Main4Activity.this,Main5Activity.class);
        startActivity(intent);
    }
    public void diyaloglar(View v){
        Intent intent= new Intent(Main4Activity.this,Main7Activity.class);
        startActivity(intent);
    }
    }

