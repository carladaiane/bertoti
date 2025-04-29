package org.example.singleton;

public class Impressora {

    private static Impressora instanciaUnica;

    private Impressora() {
        System.out.println("Impressora criada!");
    }

    public static Impressora getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Impressora();
        }
        return instanciaUnica;
    }

    public void imprimir(String documento) {
        System.out.println("Imprimindo documento: " + documento);
    }
}
