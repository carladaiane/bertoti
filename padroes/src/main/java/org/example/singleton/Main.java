package org.example.singleton;

public class Main {
    public static void main(String[] args) {

        Impressora impressora1 = Impressora.getInstancia();
        Impressora impressora2 = Impressora.getInstancia();
        Impressora impressora3 = Impressora.getInstancia();


        impressora1.imprimir("Relatório de vendas");
        impressora2.imprimir("Nota fiscal");
        impressora3.imprimir("AAAAAAAAAAAAAAA");

        if (impressora1 == impressora2) {
            System.out.println("Ambas as variáveis apontam para a mesma impressora!");
        } else {
            System.out.println("As impressoras são diferentes.");
        }
    }
}
