package com.example.proyecto260225;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.math.BigDecimal;

public class Calculadora extends AppCompatActivity {

    ICalculadoraUI calculadoraUI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);

        calculadoraUI = new CalculadoraUI(this, new CalculadoraImpl());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        calculadoraUI.calculate(new CalculadoraOnResult() {
            @Override
            public void onResult(BigDecimal x, BigDecimal y, Operacion operacion) {
                calculadora.calculate(operacion, x, y);
            }
        });
    }
}