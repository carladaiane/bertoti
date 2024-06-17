package org.example;

public class Aluno {
    private String nome;
    private String materia;
    private double nota;

    public Aluno(String nome, String materia, double nota) {
        this.nome = nome;
        this.materia = materia;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getMateria() {
        return materia;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Matéria: " + materia + ", Nota: " + nota;
    }
}
