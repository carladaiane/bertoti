package org.example.observer.pattern;

public class Main {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();

        Celular app = new Celular();
        ArCondicionado ar = new ArCondicionado();
        Aquecedor aquecedor = new Aquecedor();

        termometro.adicionarObserver(app);
        termometro.adicionarObserver(ar);
        termometro.adicionarObserver(aquecedor);

        termometro.mudarTemperatura(30);

        termometro.removerObserver(ar);

        termometro.mudarTemperatura(15);
    }
}
