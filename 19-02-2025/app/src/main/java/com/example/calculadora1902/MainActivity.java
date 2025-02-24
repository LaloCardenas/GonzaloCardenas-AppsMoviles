package com.example.calculadora1902;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.renderscript.RenderScript;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txVMiTexto;
    String cadena = "";
    Button btnReinicio;

    int numeroActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Log.println(Log.INFO, null, "onCreate savedInstanceState");

        txVMiTexto = findViewById(R.id.txv_main);
        //cadena += "\n| onCreate(savedInstanceState)";
        txVMiTexto.setText(cadena);
        btnReinicio = findViewById(R.id.btnReinicio);

        btnReinicio.setOnClickListener(this);

        numeroActual = 0;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.println(Log.INFO, null, "onCreate savedInstanceState");

        //cadena += "\n| onCreate(savedInstanceState, persistentState)";
        //txVMiTexto.setText(cadena);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.println(Log.INFO, null, "onStart()");

        //cadena += "\n| onStart()";
        //txVMiTexto.setText(cadena);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.println(Log.INFO, null, "onPause()");

        //cadena += "\n| onPause()";
        //txVMiTexto.setText(cadena);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.println(Log.INFO, null, "onStop()");

        //cadena += "\n| onStop()";
        //txVMiTexto.setText(cadena);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.println(Log.INFO, null, "onDestroy()");

        //cadena += "\n| onDestroy()";
        //txVMiTexto.setText(cadena);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.println(Log.INFO, null, "onRestart()");

        //cadena += "\n| onRestart()";
        //txVMiTexto.setText(cadena);
    }

    @Override
    public void onClick(View v) {
        cadena += calcularFibonacci(numeroActual) + " ";
        txVMiTexto.setText(cadena);
        numeroActual += 1;
    }

    public Double calcularFibonacci(int serie) {

        if (serie == 0) return 0.0;
        if (serie == 1) return 1.0;

        double num1 = 0, num2 = 1, suma = 1;

        for (int i = 1; i < serie; i++) {
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }

        return suma;

    }

}