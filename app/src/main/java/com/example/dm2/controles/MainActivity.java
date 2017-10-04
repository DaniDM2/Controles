package com.example.dm2.controles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Ejercicio1(View v){
        Intent intento=new Intent(MainActivity.this, Ejercicio1.class);
        startActivity(intento);
    }

    public void Ejercicio2(View v){
        Intent intento=new Intent(MainActivity.this, Ejercicio2.class);
        startActivity(intento);
    }

    public void Ejercicio3(View v){
        Intent intento=new Intent(MainActivity.this, Ejercicio3.class);
        startActivity(intento);
    }

    public void Ejercicio4(View v){
        Intent intento=new Intent(MainActivity.this, Ejercicio4validarDNI.class);
        startActivity(intento);
    }

    public void Ejercicio5(View v){
        Intent intento=new Intent(MainActivity.this, Ejercicio5Logos.class);
        startActivity(intento);
    }

    public void Ejercicio6(View v){
        Intent intento=new Intent(MainActivity.this, Ejercicio6Demotica.class);
        startActivity(intento);
    }
    public void Ejercicio7(View v){
        Intent intento=new Intent(MainActivity.this, Ejercicio7Domotica.class);
        startActivity(intento);
    }



}
