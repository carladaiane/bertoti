package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Nota> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void adicionarNota(Nota nota) {
        for (Nota n : notas) {
            if (n.getMateria().equals(nota.getMateria())) {
                throw new IllegalArgumentException("O aluno já possui uma nota para essa matéria.");
            }
        }
        notas.add(nota);
    }
}
