package com.example.josit.felicitacionnavidad;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface fuente = Typeface.createFromAsset(getAssets(),"Merry christmas.ttf");
        TextView titulo = (TextView)findViewById(R.id.principal);
        titulo.setTypeface(fuente);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.nochepaz);
        mediaPlayer.start();

    }
}
