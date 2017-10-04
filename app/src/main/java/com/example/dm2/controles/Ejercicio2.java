package com.example.dm2.controles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio2 extends AppCompatActivity {

    private EditText n1,n2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        n1=(EditText) findViewById(R.id.numero1);
        n2=(EditText) findViewById(R.id.numero2);

        res=(TextView) findViewById(R.id.resultado);
    }

    public void Sumar(View v){
       // System.out.print("1111");
        int result=Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
        //System.out.print("222");
        res.setText("El resultado es: "+result);
    }

    public void Restar(View v){
        int result=Integer.parseInt(n1.getText().toString())-Integer.parseInt(n2.getText().toString());
        res.setText("El resultado es: "+result);
    }

    public void Multiplicar(View v){
        int result=Integer.parseInt(n1.getText().toString())*Integer.parseInt(n2.getText().toString());
        res.setText("El resultado es: "+result);
    }

    public void Dividir(View v){
        int result=Integer.parseInt(n1.getText().toString())/Integer.parseInt(n2.getText().toString());
        res.setText("El resultado es: "+result);
    }


}
