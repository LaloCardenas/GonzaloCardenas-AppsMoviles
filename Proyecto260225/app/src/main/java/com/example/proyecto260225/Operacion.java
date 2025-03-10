package com.example.proyecto260225;

public enum Operacion {

    SUMA, RESTA, DIV, MULT, PORC, NONE;

    public static String convert(Operacion operacion) {

        switch (operacion) {
            case SUMA:
                return "+";
            case RESTA:
                return "-";
            case DIV:
                return "/";
            case MULT:
                return "*";
            case PORC:
                return "%";
            case NONE:
                return "Error";
        }

        return "";

    }

}
