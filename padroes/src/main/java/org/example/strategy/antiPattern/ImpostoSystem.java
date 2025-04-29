package org.example.strategy.antiPattern;

import java.util.Scanner;

public class ImpostoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor sobre o qual deseja calcular o imposto:");
        double valor = scanner.nextDouble();

        System.out.println("Escolha o imposto:");
        System.out.println("1 - ICMS");
        System.out.println("2 - ISS");
        System.out.println("3 - IPI");

        int opcao = scanner.nextInt();

        System.out.println("O pagamento será à vista? (true/false)");
        boolean pagamentoAVista = scanner.nextBoolean();

        double valorImposto = 0;
        double valorTotal;


        if (opcao == 1) {
            valorImposto = valor * 0.10;
        } else if (opcao == 2) {
            valorImposto = valor * 0.06;
        } else if (opcao == 3) {
            valorImposto = valor * 0.04;
        } else {
            System.out.println("Opção inválida!");
            scanner.close();
            return;
        }

        valorTotal = valor + valorImposto;

        System.out.printf("Valor do produto: R$ %.2f%n", valor);
        System.out.printf("Valor do imposto: R$ %.2f%n", valorImposto);
        System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
