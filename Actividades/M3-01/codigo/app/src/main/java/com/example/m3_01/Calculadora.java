package com.example.m3_01;

import java.math.BigDecimal;

public class Calculadora implements ICalculadora {

    @Override
    public BigDecimal sumar(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }

    @Override
    public BigDecimal restar(BigDecimal x, BigDecimal y) {
        return x.subtract(y);
    }

    @Override
    public BigDecimal multiplicar(BigDecimal x, BigDecimal y) {
        return x.multiply(y);
    }

    @Override
    public BigDecimal dividir(BigDecimal x, BigDecimal y) {
        if (y.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("División por cero");
        }
        return x.divide(y, 10, BigDecimal.ROUND_HALF_UP);
    }

}
