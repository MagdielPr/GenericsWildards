package Wildcard2;

import java.util.List;

public class Lista {
	public static <T extends Number> void adicionarNumeros(List<T> lista, T novoNumero) {
        lista.add(novoNumero);
        System.out.println("Elementos da lista:");
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
