package com.example.m3_01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    TextView resultTv, solutionTv;
    Button buttonC, buttonBrackOpen, buttonBrackClose;
    Button buttonDivide, buttonMultiply, buttonPlus, buttonMinus, buttonEquals;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonAC, buttonDot;

    StringBuilder currentInput = new StringBuilder();

    Calculadora calculadora = new Calculadora();

    BigDecimal operando1 = null;
    String operador = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);
        buttonC = findViewById(R.id.button_c);
        buttonBrackOpen = findViewById(R.id.button_open_bracket);
        buttonBrackClose = findViewById(R.id.button_close_bracket);
        buttonDivide = findViewById(R.id.button_divide);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonEquals = findViewById(R.id.button_equals);
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        buttonAC = findViewById(R.id.button_ac);
        buttonDot = findViewById(R.id.button_dot);

        // Números y punto decimal
        setDigitListener(R.id.button_0, "0");
        setDigitListener(R.id.button_1, "1");
        setDigitListener(R.id.button_2, "2");
        setDigitListener(R.id.button_3, "3");
        setDigitListener(R.id.button_4, "4");
        setDigitListener(R.id.button_5, "5");
        setDigitListener(R.id.button_6, "6");
        setDigitListener(R.id.button_7, "7");
        setDigitListener(R.id.button_8, "8");
        setDigitListener(R.id.button_9, "9");
        setDigitListener(R.id.button_dot, ".");

        // Paréntesis
        setDigitListener(R.id.button_open_bracket, "(");
        setDigitListener(R.id.button_close_bracket, ")");

        // Operadores
        setOperatorListener(R.id.button_plus, "+");
        setOperatorListener(R.id.button_minus, "-");
        setOperatorListener(R.id.button_multiply, "*");
        setOperatorListener(R.id.button_divide, "/");

        // Botón "="
        findViewById(R.id.button_equals).setOnClickListener(view -> {
            if (operador != null && operando1 != null && currentInput.length() > 0) {
                try {
                    BigDecimal operando2 = new BigDecimal(currentInput.toString());
                    BigDecimal resultado = calcular(operando1, operando2, operador);
                    resultTv.setText(resultado.stripTrailingZeros().toPlainString());
                    solutionTv.setText("");
                    currentInput.setLength(0);
                    operador = null;
                    operando1 = null;
                } catch (Exception e) {
                    resultTv.setText("Error");
                }
            }
        });

        // Botón AC
        findViewById(R.id.button_ac).setOnClickListener(view -> {
            currentInput.setLength(0);
            operando1 = null;
            operador = null;
            solutionTv.setText("");
            resultTv.setText("0");
        });

        // Botón C
        findViewById(R.id.button_c).setOnClickListener(view -> {
            if (currentInput.length() > 0) {
                currentInput.deleteCharAt(currentInput.length() - 1);
                solutionTv.setText(currentInput.toString());
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void setDigitListener(int id, String value) {
        Button button = findViewById(id);
        button.setOnClickListener(view -> {
            currentInput.append(value);
            solutionTv.setText(currentInput.toString());
        });
    }

    private void setOperatorListener(int id, String op) {
        Button button = findViewById(id);
        button.setOnClickListener(view -> {
            if (currentInput.length() > 0) {
                try {
                    operando1 = new BigDecimal(currentInput.toString());
                    operador = op;
                    currentInput.setLength(0);
                    solutionTv.setText("");
                } catch (Exception e) {
                    resultTv.setText("Error");
                }
            }
        });
    }

    private BigDecimal calcular(BigDecimal x, BigDecimal y, String op) {
        switch (op) {
            case "+": return calculadora.sumar(x, y);
            case "-": return calculadora.restar(x, y);
            case "*": return calculadora.multiplicar(x, y);
            case "/": return calculadora.dividir(x, y);
            default: throw new IllegalArgumentException("Operador no válido");
        }
    }
}
