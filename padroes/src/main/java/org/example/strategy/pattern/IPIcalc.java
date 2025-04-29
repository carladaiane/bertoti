package org.example.strategy.pattern;

public class IPIcalc implements ImpostoInterface {
    @Override
    public double calcular(double valor) {
        return valor * 0.04; // IPI é 4%
    }
}
