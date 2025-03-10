package com.example.proyecto260225;

public enum Numeracion {

    CERO, UNO, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, NONE;


    public static Numeracion convert(String numero) {

        switch (numero) {
            case "0":
                return Numeracion.CERO;
            case "1":
                return Numeracion.UNO;
            case "2":
                return Numeracion.DOS;
            case "3":
                return Numeracion.TRES;
            case "4":
                return Numeracion.CUATRO;
            case "5":
                return Numeracion.CINCO;
            case "6":
                return Numeracion.SEIS;
            case "7":
                return Numeracion.SIETE;
            case "8":
                return Numeracion.OCHO;
            case "9":
                return Numeracion.NUEVE;
        }
        return Numeracion.NONE;
    }

    public static String convert(Numeracion numeracion) {

        switch (numeracion) {
            case CERO:
                return "0";
            case UNO:
                return "1";
            case DOS:
                return "2";
            case TRES:
                return "3";
            case CUATRO:
                return "4";
            case CINCO:
                return "5";
            case SEIS:
                return "6";
            case SIETE:
                return "7";
            case OCHO:
                return "8";
            case NUEVE:
                return "9";
            case NONE:
                return "";
        }

        return "";

    }

}
