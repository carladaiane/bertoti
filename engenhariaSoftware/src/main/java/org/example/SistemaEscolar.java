package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaEscolar {
    private List<Aluno> alunos;
    private List<Materia> materias;

    public SistemaEscolar() {
        this.alunos = new ArrayList<>();
        this.materias = new ArrayList<>();
    }

    public void cadastrarAluno(String nome) {
        Aluno aluno = new Aluno(nome);
        alunos.add(aluno);
        System.out.println("Aluno " + nome + " cadastrado com sucesso.");
    }

    public void cadastrarMateria(String nome) {
        Materia materia = new Materia(nome);
        materias.add(materia);
        System.out.println("Matéria " + nome + " cadastrada com sucesso.");
    }

    public void adicionarNota(String nomeAluno, String nomeMateria, double valor) {
        Aluno aluno = buscarAluno(nomeAluno);
        Materia materia = buscarMateria(nomeMateria);
        
        if (aluno != null && materia != null) {
            Nota nota = new Nota(materia, valor);
            aluno.adicionarNota(nota);
            System.out.println("Nota " + valor + " adicionada para o aluno " + nomeAluno + " na matéria " + nomeMateria + ".");
        } else {
            System.out.println("Aluno ou matéria não encontrados.");
        }
    }

    private Aluno buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

    private Materia buscarMateria(String nome) {
        for (Materia materia : materias) {
            if (materia.getNome().equalsIgnoreCase(nome)) {
                return materia;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SistemaEscolar sistema = new SistemaEscolar();
        
        // Cadastrando alunos
        sistema.cadastrarAluno("João");
        sistema.cadastrarAluno("Maria");
        
        // Cadastrando matérias
        sistema.cadastrarMateria("Matemática");
        sistema.cadastrarMateria("Português");
        
        // Adicionando notas
        sistema.adicionarNota("João", "Matemática", 8.5);
        sistema.adicionarNota("Maria", "Português", 9.0);


}

}