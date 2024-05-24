package org.example;

public class Nota {
    private Aluno aluno;
    private Materia materia;
    private double valor;

    public Nota(Aluno aluno, Materia materia, double valor) {
        this.aluno = aluno;
        this.materia = materia;
        this.valor = valor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getValor() {
        return valor;
    }
}
