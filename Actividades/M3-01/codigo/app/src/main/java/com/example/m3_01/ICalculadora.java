package com.example.m3_01;

import java.math.BigDecimal;

public interface ICalculadora {
    BigDecimal sumar(BigDecimal x, BigDecimal y);
    BigDecimal restar(BigDecimal x, BigDecimal y);
    BigDecimal multiplicar(BigDecimal x, BigDecimal y);
    BigDecimal dividir(BigDecimal x, BigDecimal y);
}
