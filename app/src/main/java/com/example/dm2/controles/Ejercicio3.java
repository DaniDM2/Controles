package com.example.dm2.controles;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Ejercicio3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio3);
    }
//NO FUNCIONAAAAAA HOLY SHIT NIGA
    public void Encender(View v){
        LinearLayout fondo= (LinearLayout) findViewById(R.id.fondo);
        fondo.setBackgroundColor(Color.GREEN);
    }

    public void Apagar(View v){
        LinearLayout fondo= (LinearLayout) findViewById(R.id.fondo);
        fondo.setBackgroundColor(Color.GRAY);
    }
}
