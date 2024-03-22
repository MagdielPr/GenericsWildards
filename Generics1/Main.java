package Generics1;

import java.util.List;

public class Main {
	public static void main(String[] args) {
        Apartamento<String> apartamentoMoveis = new Apartamento<>();
        apartamentoMoveis.adicionarItem("Sofá");
        apartamentoMoveis.adicionarItem("Cama");
        apartamentoMoveis.adicionarItem("Mesa");

        List<String> moveis = apartamentoMoveis.obterItens();
        System.out.println("Itens do apartamento de móveis:");
        for (String movel : moveis) {
            System.out.println(movel);
        }
    }
}
