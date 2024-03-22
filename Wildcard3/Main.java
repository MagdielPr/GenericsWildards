package Wildcard3;

import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Integer> inteiros = List.of(10, 20, 30, 40, 50);
        System.out.println("Média dos inteiros: " + Calculadora.calcularMedia(inteiros));
    }
}
