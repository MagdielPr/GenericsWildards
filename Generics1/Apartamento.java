package Generics1;

import java.util.ArrayList;
import java.util.List;

public class Apartamento<T> {
    private List<T> itens;

    public Apartamento() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        itens.add(item);
    }

    public List<T> obterItens() {
        return itens;
    }
}