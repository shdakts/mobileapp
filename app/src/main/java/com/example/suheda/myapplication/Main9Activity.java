package com.example.suheda.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity {

    ListView listView;


    private String[] cümleler ={ "Salut	(Merhaba) "
            ,"Comment ça va?	(Nasılsın?)"
            ,"Ça va bien, et toi?(İyiyim, ya sen?)"
            ,"Oui, ça va. Comment t'appelles-tu?	(Evet, iyiyim. Adın nedir?)"
            ,"Je m'appelle Marc, et toi?	(Adım Mark, ya senin?)"
            ,"Moi, je m'appelle Marie. D'où viens-tu Marc?(Benim adım Marie. Sen nereden geldin Marc?)"
            ,"Je viens du Canada, je suis canadien, et toi?	(Ben Kanada'dan geldim. Kanadalıyım, ya sen?)"
            ,"Moi, je viens États-Unis, je suis Américaine! (Ben, Amerika birleşik devletlerinden geldim. Amerikanım.)"
            ,"Où habites-tu?	( Nerde kalıyorsun?)"
            ,"J'habite à Qubec(Ben Quebec'te yaşıyorum.)"
            ,"Toi, qu'est-ce que tu fais?(Ne yapıyorsun?)"
            ,"Je suis photogtaphe, je travaille pour un jurnal.(Ben fotoğrafçıyım, bir gazete için çalışıyorum.)	"
            ,"Ça me fait plaisier de te rencontrer Marc!	(Seninle tanıştığıma memnun oldum Mark.)"
            ,"Moi aussi Marie! Au revoir.(Bende Marie. Hoşçakal.)"
            ,"Au revoir, et à la prochaine!(Hoşçakal, ve sonraki sefere görüşmek üzere.)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        listView = (ListView)findViewById(R.id.listView1);

        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, cümleler);

        listView.setAdapter(adapter);

    }

    }


