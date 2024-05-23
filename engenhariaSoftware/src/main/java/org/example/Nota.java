package org.example;

public class Nota {
    private Materia materia;
    private double valor;

    public Nota(Materia materia, double valor) {
        this.materia = materia;
        this.valor = valor;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getValor() {
        return valor;
    }
}
