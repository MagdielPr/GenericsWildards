package Wildcard1;

import java.util.List;

public class Lista<T> {
	public static <T> void imprimirLista(List<T> lista) {
        System.out.println("Elementos da lista:");
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }
}
