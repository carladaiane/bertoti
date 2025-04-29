package org.example.strategy.antiPattern;

public class ICMScalc implements ImpostoInterface {

    @Override
    public double calcular(double valor) {
        return valor * 0.10;
    }
}
