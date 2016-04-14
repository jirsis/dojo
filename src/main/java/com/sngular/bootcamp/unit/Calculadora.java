package com.sngular.bootcamp.unit;

public class Calculadora {
    public int dimeElResultadoDe(String cadena){
        Extractor extractor = new Extractor();
        
        //sacamos los operandos
        int [] operandos = extractor.extOp(cadena);
        
        //sacamos el operador
        String operador = extractor.extOper(cadena);
        int resultado = 0;
        
        //elegimos la operacion
        switch(operador){
        case "+":
            resultado = operandos[0]+operandos[1];
           break;
        case "-":
            resultado = operandos[0]-operandos[1];
            break;
        }
        
        //devolvemos el resultado
        return resultado;
    }

}
