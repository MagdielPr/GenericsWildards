package Generics2;

public class Main {
    public static void main(String[] args) {
        Livro<String> livroString = new Livro<>("Como Programar JAVA");
        Capitulo<String> capitulo1 = new Capitulo<>("Introdução");
        capitulo1.adicionarConteudo("Generics");
        capitulo1.adicionarConteudo("Wildcard");
        livroString.adicionarCapitulo(capitulo1);

        
        System.out.println("Livro: " + livroString.getTitulo());
        for (Capitulo<String> capitulo : livroString.getCapitulos()) {
            System.out.println("  Capítulo: " + capitulo.getTitulo());
            for (String conteudo : capitulo.getConteudo()) {
                System.out.println("    Conteúdo: " + conteudo);
            }
        }
    }

}
