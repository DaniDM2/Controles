package com.example.dm2.controles;

import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Ejercicio7Domotica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7_domotica);
    }

    public void Cam1(View v){
        ImageView cam1= (ImageView) findViewById(R.id.cam1);
        ImageView luz1= (ImageView) findViewById(R.id.luz1);
        Switch  sw1= (Switch) findViewById(R.id.sw1);

        if (sw1.isChecked()){
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

    public void Per(View v){
        ImageView cam2= (ImageView) findViewById(R.id.cam2);
        ToggleButton tg1= (ToggleButton) findViewById(R.id.tg1);

        if (tg1.isChecked()){
            cam2.setVisibility(View.VISIBLE);
        }else{
            cam2.setVisibility(View.INVISIBLE);
        }
    }

    public void MasTemp(View v){
        TextView temp=(TextView) findViewById(R.id.temperatura);
        String[] str=temp.getText().toString().split("º");
        int t=Integer.parseInt(str[0]);
        t++;

        temp.setText(t+"º");
    }

    public void MenosTemp(View v){
        TextView temp=(TextView) findViewById(R.id.temperatura);
        String[] str=temp.getText().toString().split("º");
        int t=Integer.parseInt(str[0]);
        t--;

        temp.setText(t+"º");
    }
}
