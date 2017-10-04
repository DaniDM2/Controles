package com.example.dm2.controles;

import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Ejercicio6Demotica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6_demotica);
        ///System.out.print("AAAAAAAA");
       // Log.v("Mensaje", "AAAAAAA");
    }

    public void Cam1(View v){
        ImageView cam1= (ImageView) findViewById(R.id.cam1);
        ImageView luz1= (ImageView) findViewById(R.id.luz1);
        Switch  sw1= (Switch) findViewById(R.id.sw1);

        if (sw1.isChecked()){
            System.out.print("EEEE");
            Log.v("Mensaje", "EEEAAAAAAA");
            cam1.setVisibility(View.VISIBLE);
        }else{
            luz1.setImageResource(R.drawable.apagada);
            cam1.setVisibility(View.INVISIBLE);
        }

    }

    public void Luz1(View v){
        ImageView luz1= (ImageView) findViewById(R.id.luz1);
        Switch  sw2= (Switch) findViewById(R.id.sw2);

        if (sw2.isChecked()){
            luz1.setImageResource(R.drawable.encendida);
        }else{
            luz1.setImageResource(R.drawable.apagada);
        }

    }

    public void Cam2(View v){
        ImageView cam2= (ImageView) findViewById(R.id.cam2);
        ImageView luz2= (ImageView) findViewById(R.id.luz2);
        ToggleButton tg1= (ToggleButton) findViewById(R.id.tg1);

        if (tg1.isChecked()){
            System.out.print("EEEE");
            cam2.setVisibility(View.VISIBLE);
        }else{
            luz2.setImageResource(R.drawable.apagada);
            cam2.setVisibility(View.INVISIBLE);
        }

    }

    public void Luz2(View v){
        ImageView luz2= (ImageView) findViewById(R.id.luz2);
        ToggleButton  tg2= (ToggleButton) findViewById(R.id.tg2);

        if (tg2.isChecked()){
            luz2.setImageResource(R.drawable.encendida);
        }else{
            luz2.setImageResource(R.drawable.apagada);
        }
    }


}
