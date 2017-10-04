package com.example.dm2.controles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1 extends AppCompatActivity {

    private EditText n1,n2;
    //private int result;
    private TextView resText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        n1 = (EditText)findViewById(R.id.editText2);
        n2= (EditText) findViewById(R.id.editText2);
        resText= (TextView) findViewById(R.id.resultado);
    }

    public void Sumar(View v){
        //n1= (EditText) findViewById(R.id.textView2);
        //n2= (EditText) findViewById(R.id.textView);
        //resText= (TextView) findViewById(R.id.resultado);

        int result=Integer.parseInt(String.valueOf(n1.getText()))+Integer.parseInt(String.valueOf(n2.getText()));
        resText.setText(Integer.toString(result));
    }
}
