package com.example.proyecto260225;

import java.math.BigDecimal;

public interface ICalculadoraMemoria {

    String concat(String numero);

    String concat(Operacion operacion);

    Operacion getOperacion();

    BigDecimal getX();

    BigDecimal getY();

    void clear();

    void igual();

}
