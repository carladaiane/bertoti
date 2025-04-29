package org.example.observer.pattern;

public class ArCondicionado implements Observer {
    @Override
    public void update(double temperatura) {
        if (temperatura > 25) {
            System.out.println("ArCondicionado: Está quente! Ligando o ar...");
        }
    }
}
