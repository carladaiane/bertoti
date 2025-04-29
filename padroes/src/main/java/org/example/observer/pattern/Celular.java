package org.example.observer.pattern;

public class Celular implements Observer {
    @Override
    public void update(double temperatura) {
        System.out.println("AppCelular: Nova temperatura é " + temperatura + "°C");
    }
}
