package com.sngular.bootcamp.unit;

public class Extractor {

    public int[] extOp(String cadena) {
        int [] operandos = {Integer.parseInt(cadena.charAt(0)+""), Integer.parseInt(cadena.charAt(2)+"")};
        return operandos;
    }

    public String extOper(String cadena) {
        return String.valueOf(cadena.charAt(1));
    }

}
