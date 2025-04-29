package org.example.observer.antiPattern;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        ArCondicionado ar = new ArCondicionado();
        Termometro termometro = new Termometro(celular, ar);

        termometro.mudarTemperatura(30.0);
        termometro.mudarTemperatura(22.0);
    }
}
