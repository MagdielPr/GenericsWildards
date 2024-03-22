package Generics2;

import java.util.ArrayList;
import java.util.List;

class Capitulo<T> {
    private String titulo;
    private List<T> conteudo;

    public Capitulo(String titulo) {
        this.titulo = titulo;
        this.conteudo = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarConteudo(T conteudo) {
        this.conteudo.add(conteudo);
    }

    public List<T> getConteudo() {
        return conteudo;
    }
}
