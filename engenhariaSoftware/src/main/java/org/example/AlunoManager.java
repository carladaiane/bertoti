package org.example;

import java.util.ArrayList;
import java.util.List;

public class AlunoManager {
    private List<Aluno> alunos;

    public AlunoManager() {
        this.alunos = new ArrayList<>();
    }

    public void cadastrarAluno(String nome, String materia, double nota) {
        Aluno aluno = new Aluno(nome, materia, nota);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso.");
    }

    public Aluno buscarPorNome(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public void buscarPorMateria(String materia) {
        boolean encontrado = false;
        for (Aluno aluno : alunos) {
            if (aluno.getMateria().equalsIgnoreCase(materia)) {
                System.out.println(aluno);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum aluno encontrado para a matéria: " + materia);
        }
    }

    public void buscarPorNota(double nota) {
        boolean encontrado = false;
        for (Aluno aluno : alunos) {
            if (aluno.getNota() == nota) {
                System.out.println(aluno);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum aluno encontrado com a nota: " + nota);
        }
    }

    public void listarAlunosPorNota(double nota) {
        for (Aluno aluno : alunos) {
            if (aluno.getNota() == nota) {
                System.out.println(aluno);
            }
        }
    }

    public void listarAlunosPorMateria(String materia) {
        for (Aluno aluno : alunos) {
            if (aluno.getMateria().equalsIgnoreCase(materia)) {
                System.out.println(aluno);
            }
        }
    }

    public void listarMateriasDeAluno(String nome) {
        List<String> materias = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                materias.add(aluno.getMateria());
            }
        }
        if (!materias.isEmpty()) {
            System.out.println("Matérias de " + nome + ": " + String.join(", ", materias));
        } else {
            System.out.println("Nenhuma matéria encontrada para o aluno: " + nome);
        }
    }
}
