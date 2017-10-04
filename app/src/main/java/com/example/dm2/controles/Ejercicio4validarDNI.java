package com.example.dm2.controles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Ejercicio4validarDNI extends AppCompatActivity {

    private EditText e;
    private EditText let;
    private static final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio4validar_dni);

        e=(EditText) findViewById(R.id.Numero);
        let= (EditText) findViewById(R.id.Letra);

    }

    public void Validar(View v){
        int numero=Integer.parseInt(e.getText().toString());
        char letra=letraDNI(numero);

        let.setText(String.valueOf(letra));

    }

    public static char letraDNI(int dni) {
        return NIF_STRING_ASOCIATION.charAt(dni % 23);
    }
}
