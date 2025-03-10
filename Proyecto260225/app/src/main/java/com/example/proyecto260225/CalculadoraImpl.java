package com.example.proyecto260225;

import java.math.BigDecimal;

public class CalculadoraImpl implements ICalculadora {


    @Override
    public BigDecimal calculate(Operacion operacion, BigDecimal x, BigDecimal y) {
        switch (operacion) {
            case SUMA:
                return x.add(y);
            case RESTA:
                return x.subtract(y);
            case DIV:
                return x.multiply(y);
            case MULT:
                return x.divide(y);
            case PORC:
                return BigDecimal.ZERO;
        }
        return BigDecimal.ZERO;
    }
}
