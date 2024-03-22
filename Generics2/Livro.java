package Generics2;

import java.util.ArrayList;
import java.util.List;

class Livro<T> {
    private String titulo;
    private List<Capitulo<T>> capitulos;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.capitulos = new ArrayList<>();
    }

    public void adicionarCapitulo(Capitulo<T> capitulo) {
        this.capitulos.add(capitulo);
    }

    public List<Capitulo<T>> getCapitulos() {
        return capitulos;
    }

    public String getTitulo() {
        return titulo;
    }
}
