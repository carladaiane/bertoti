package org.example.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Termometro implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double temperatura;

    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.update(temperatura);
        }
    }

    public void mudarTemperatura(double novaTemperatura) {
        System.out.println("\nTemperatura mudando para " + novaTemperatura + "°C");
        this.temperatura = novaTemperatura;
        notificarObservers();
    }
}
