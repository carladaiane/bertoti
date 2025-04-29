package org.example.observer.antiPattern;

public class Termometro {
    private double temperatura;
    private Celular appCelular;
    private ArCondicionado arCondicionado;

    public Termometro(Celular appCelular, ArCondicionado arCondicionado) {
        this.appCelular = appCelular;
        this.arCondicionado = arCondicionado;
    }

    public void mudarTemperatura(double novaTemperatura) {
        System.out.println("\nTemperatura alterada para: " + novaTemperatura + "°C");
        this.temperatura = novaTemperatura;

        appCelular.receberAtualizacao(temperatura);
        arCondicionado.verificarTemperatura(temperatura);
    }
}
