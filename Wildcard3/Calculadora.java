package Wildcard3;

import java.util.List;

public class Calculadora {
    
    public static double calcularMedia(List<? extends Number> numeros) {
        double soma = 0.0;
        for (Number numero : numeros) {
            soma += numero.doubleValue(); 
        }
        return soma / numeros.size(); 
    }
}