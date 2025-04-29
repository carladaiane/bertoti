package org.example.observer.antiPattern;

public class Celular {
    public void receberAtualizacao(double temperatura) {
        System.out.println("App no celular recebeu nova temperatura: " + temperatura + "°C");
    }
}
