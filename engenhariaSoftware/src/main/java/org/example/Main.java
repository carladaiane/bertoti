package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlunoManager alunoManager = new AlunoManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Buscar aluno por nome");
            System.out.println("3. Buscar aluno por matéria");
            System.out.println("4. Buscar aluno por nota");
            System.out.println("5. Listar alunos com nota X");
            System.out.println("6. Listar alunos na matéria X");
            System.out.println("7. Listar matérias de um aluno");
            System.out.println("8. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Nome do aluno:");
                    String nome = scanner.nextLine();
                    System.out.println("Matéria:");
                    String materia = scanner.nextLine();
                    System.out.println("Nota:");
                    double nota = scanner.nextDouble();
                    alunoManager.cadastrarAluno(nome, materia, nota);
                    break;
                case 2:
                    System.out.println("Nome do aluno:");
                    nome = scanner.nextLine();
                    Aluno aluno = alunoManager.buscarPorNome(nome);
                    if (aluno != null) {
                        System.out.println("Aluno encontrado: " + aluno);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Matéria:");
                    materia = scanner.nextLine();
                    alunoManager.buscarPorMateria(materia);
                    break;
                case 4:
                    System.out.println("Nota:");
                    nota = scanner.nextDouble();
                    alunoManager.buscarPorNota(nota);
                    break;
                case 5:
                    System.out.println("Nota:");
                    nota = scanner.nextDouble();
                    alunoManager.listarAlunosPorNota(nota);
                    break;
                case 6:
                    System.out.println("Matéria:");
                    materia = scanner.nextLine();
                    alunoManager.listarAlunosPorMateria(materia);
                    break;
                case 7:
                    System.out.println("Nome do aluno:");
                    nome = scanner.nextLine();
                    alunoManager.listarMateriasDeAluno(nome);
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
