package com.example.dm2.controles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Ejercicio5Logos extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5_logos);
    }

    public void YahooIMG(View v){
        img= (ImageView) findViewById(R.id.imagen);
        img.setImageResource(R.drawable.yahoo);
    }
    public void BingIMG(View v){
        img= (ImageView) findViewById(R.id.imagen);
        img.setImageResource(R.drawable.bing);
    }
    public void GoogleIMG(View v){
        img= (ImageView) findViewById(R.id.imagen);
        img.setImageResource(R.drawable.google);
    }



}
