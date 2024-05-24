package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAcademico {
    private List<Aluno> alunos;
    private List<Materia> materias;

    public SistemaAcademico() {
        alunos = new ArrayList<>();
        materias = new ArrayList<>();
    }

    public void cadastrarAluno(String nome) {
        if (buscarAluno(nome) == null) {
            alunos.add(new Aluno(nome));
        } else {
            System.out.println("Aluno já cadastrado.");
        }
    }

    public void cadastrarMateria(String nome) {
        if (buscarMateria(nome) == null) {
            materias.add(new Materia(nome));
        } else {
            System.out.println("Matéria já cadastrada.");
        }
    }

    public void atribuirNota(String nomeAluno, String nomeMateria, double valor) {
        Aluno aluno = buscarAluno(nomeAluno);
        Materia materia = buscarMateria(nomeMateria);
        if (aluno != null && materia != null) {
            aluno.adicionarNota(new Nota(aluno, materia, valor));
        } else {
            System.out.println("Aluno ou matéria não encontrados. Não é possível atribuir nota.");
        }
    }

    public Aluno buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public Materia buscarMateria(String nome) {
        for (Materia materia : materias) {
            if (materia.getNomeMateria().equals(nome)) {
                return materia;
            }
        }
        return null;
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
        }
    }

    public void listarAlunosComNotas() {
        boolean temNota = false;
        for (Aluno aluno : alunos) {
            if (!aluno.getNotas().isEmpty()) {
                temNota = true;
                System.out.println("Aluno: " + aluno.getNome());
                for (Nota nota : aluno.getNotas()) {
                    System.out.println(" - " + nota.getMateria().getNomeMateria() + ": " + nota.getValor());
                }
            }
        }
        if (!temNota) {
            System.out.println("Nenhum aluno possui notas cadastradas.");
        }
    }

    public void listarMaterias() {
        for (Materia materia : materias) {
            System.out.println("Matéria: " + materia.getNomeMateria());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaAcademico sistema = new SistemaAcademico();

        while (true) {
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Matéria");
            System.out.println("3. Atribuir Nota");
            System.out.println("4. Listar Alunos");
            System.out.println("5. Listar Alunos com Notas");
            System.out.println("6. Listar Matérias");
            System.out.println("7. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir newline

            if (opcao == 1) {
                System.out.print("Nome do aluno: ");
                String nome = scanner.nextLine();
                sistema.cadastrarAluno(nome);
            } else if (opcao == 2) {
                System.out.print("Nome da matéria: ");
                String nome = scanner.nextLine();
                sistema.cadastrarMateria(nome);
            } else if (opcao == 3) {
                System.out.print("Nome do aluno: ");
                String nomeAluno = scanner.nextLine();
                System.out.print("Nome da matéria: ");
                String nomeMateria = scanner.nextLine();
                System.out.print("Nota: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();  // Consumir newline
                sistema.atribuirNota(nomeAluno, nomeMateria, valor);
            } else if (opcao == 4) {
                sistema.listarAlunos();
            } else if (opcao == 5) {
                sistema.listarAlunosComNotas();
            } else if (opcao == 6) {
                sistema.listarMaterias();
            } else if (opcao == 7) {
                break;
            }
        }
        scanner.close();
    }
}
