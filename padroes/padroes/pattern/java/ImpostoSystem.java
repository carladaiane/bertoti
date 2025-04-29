package org.example;

import java.util.Scanner;

public class ImpostoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImpostoStrategy calculadora = new ImpostoStrategy();

        System.out.println("Digite o valor sobre o qual deseja calcular o imposto:");
        double valor = scanner.nextDouble();

        System.out.println("Escolha o imposto:");
        System.out.println("1 - ICMS");
        System.out.println("2 - ISS");
        System.out.println("3 - IPI");

        int opcao = scanner.nextInt();

        System.out.println("O pagamento será à vista? (true/false)");
        boolean pagamentoAVista = scanner.nextBoolean();

        switch (opcao) {
            case 1:
                calculadora.setEstrategia(new ICMScalc());
                break;
            case 2:
                calculadora.setEstrategia(new ISScalc());
                break;
            case 3:
                calculadora.setEstrategia(new IPIcalc());
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        double valorImposto = calculadora.calcularImposto(valor);

        System.out.printf("Valor do produto: R$ %.2f%n", valor);
        System.out.printf("Valor do imposto: R$ %.2f%n", valorImposto);

        if (opcao == 1 && pagamentoAVista) {
            valorImposto *= 0.98;
            System.out.println("Desconto de 2% no ICMS aplicado devido ao pagamento à vista.");
            System.out.printf("Valor do imposto com desconto: R$ %.2f%n", valorImposto);
        }

        scanner.close();
    }
}
