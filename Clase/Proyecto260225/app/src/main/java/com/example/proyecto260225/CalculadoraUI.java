package com.example.proyecto260225;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;

public class CalculadoraUI implements ICalculadoraUI, View.OnClickListener {

    CalculadoraOnResult calculadoraResult = null;

    ICalculadora logica;

    ICalculadoraMemoria memoria = new CalculadoraMemoria();

    Context context;

    TextView txvDisplay;

    Button btnSuma;
    Button btnResta;
    Button btnMultiplicacion;
    Button btnDivision;

    Button btnIgual;

    Button btnUno;
    Button btnDos;
    Button btnTres;
    Button btnCuatro;
    Button btnCinco;
    Button btnSeis;
    Button btnSiete;
    Button btnOcho;
    Button btnNueve;
    Button btnCero;

    Button btnPorcentaje;
    Button btnPunto;
    Button btnMasMenos;
    Button btnClear;

    public CalculadoraUI(Activity activity, ICalculadora logica) {

        this.logica = logica;

        context = activity.getApplicationContext();
        btnCero = activity.findViewById(R.id.numCero);
        btnUno = activity.findViewById(R.id.numUno);
        btnDos = activity.findViewById(R.id.numDos);
        btnTres = activity.findViewById(R.id.numTres);
        btnCuatro = activity.findViewById(R.id.numCuatro);
        btnCinco = activity.findViewById(R.id.numCinco);
        btnSeis = activity.findViewById(R.id.numSeis);
        btnSiete = activity.findViewById(R.id.numSiete);
        btnOcho = activity.findViewById(R.id.numOcho);
        btnNueve = activity.findViewById(R.id.numNueve);

        btnSuma = activity.findViewById(R.id.signoMas);
        btnResta = activity.findViewById(R.id.signoMenos);
        btnMultiplicacion = activity.findViewById(R.id.signoPor);
        btnDivision = activity.findViewById(R.id.signoDivision);

        btnIgual = activity.findViewById(R.id.signoIgual);

        btnPorcentaje = activity.findViewById(R.id.btnPorcentaje);

        btnPunto = activity.findViewById(R.id.btnPunto);

        btnClear = activity.findViewById(R.id.btnClear);

        txvDisplay = activity.findViewById(R.id.txvResultado);

        btnCero.setOnClickListener(v -> {
            addNumber("0");
        });
        btnUno.setOnClickListener(v -> {
            addNumber("1");

        });
        btnDos.setOnClickListener(v -> {
            addNumber("2");

        });
        btnTres.setOnClickListener(v -> {
            addNumber("3");

        });
        btnCuatro.setOnClickListener(v -> {
            addNumber("4");

        });
        btnCinco.setOnClickListener(v -> {
            addNumber("5");

        });
        btnSeis.setOnClickListener(v -> {
            addNumber("6");

        });
        btnSiete.setOnClickListener(v -> {
            addNumber("7");

        });
        btnOcho.setOnClickListener(v -> {
            addNumber("8");

        });
        btnNueve.setOnClickListener(v -> {
            addNumber("9");

        });
        btnClear.setOnClickListener(v -> {
            clearScreen();
        });
        btnSuma.setOnClickListener(v -> {
            addOperation(Operacion.SUMA);
        });
        btnResta.setOnClickListener(v -> {
            addOperation(Operacion.RESTA);

        });
        btnMultiplicacion.setOnClickListener(v -> {
            addOperation(Operacion.MULT);

        });
        btnDivision.setOnClickListener(v -> {
            addOperation(Operacion.DIV);

        });
        btnPunto.setOnClickListener(v -> {

        });
        btnPorcentaje.setOnClickListener(v -> {
            addOperation(Operacion.PORC);

        });
        btnIgual.setOnClickListener(v -> {
            if (calculadoraResult != null) {
                memoria.igual();
                calculadoraResult.onResult(
                        memoria.getX(),
                        memoria.getY(),
                        memoria.getOperacion()
                );
            }
        });

        setOnResult((x, y, operacion) -> {
            BigDecimal result = logica.calculate(operacion, x, y);
            txvDisplay.setText(String.valueOf(result));
        });




    }

    @Override
    public void clearScreen() {
        txvDisplay.setText("");
        memoria.clear();
    }

    @Override
    public void showResult(String result) {
        txvDisplay.setText(result);
    }

    @Override
    public String addNumber(String numero) {
        String newValue = memoria.concat(numero);
        txvDisplay.setText(newValue);
        return newValue;
    }

    @Override
    public void addOperation(Operacion operacion) {
        txvDisplay.setText(Operacion.convert(operacion));
        memoria.concat(operacion);
    }

    public void setOnResult(CalculadoraOnResult result) {
        this.calculadoraResult = result;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            //case R.id.u

        }
    }
}
