package org.example.observer.antiPattern;

public class ArCondicionado {
    public void verificarTemperatura(double temperatura) {
        if (temperatura > 25.0) {
            System.out.println("Ar Condicionado ligado! Temperatura alta.");
        } else {
            System.out.println("Ar Condicionado desligado. Temperatura confortável.");
        }
    }
}
