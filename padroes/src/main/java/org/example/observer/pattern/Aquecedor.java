package org.example.observer.pattern;

public class Aquecedor implements Observer {
    @Override
    public void update(double temperatura) {
        if (temperatura < 18) {
            System.out.println("Aquecedor: Está frio! Ligando o aquecedor...");
        }
    }
}
