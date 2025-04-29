package org.example;

public class ImpostoStrategy {
    private ImpostoInterface estrategia;

    public double calcularImposto(double valor) {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estratégia de imposto definida!");
        }
        return estrategia.calcular(valor);
    }

    public void setEstrategia(ImpostoInterface estrategia) {
        this.estrategia = estrategia;
    }

}
