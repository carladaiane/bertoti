package org.example.strategy.antiPattern;

import java.util.Scanner;

public class ImpostoSystem {

    private ICMScalc icms = new ICMScalc();
    private ISScalc iss = new ISScalc();
    private IPIcalc ipi = new IPIcalc();

    public static void main(String[] args) {
        ImpostoSystem system = new ImpostoSystem();
        system.executar();
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor sobre o qual deseja calcular o imposto:");
        double valor = scanner.nextDouble();

        System.out.println("Escolha o imposto:");
        System.out.println("1 - ICMS");
        System.out.println("2 - ISS");
        System.out.println("3 - IPI");

        int opcao = scanner.nextInt();

        double valorImposto = 0;

        // Anti-pattern: ainda usando if-else em vez de delegar direito
        if (opcao == 1) {
            valorImposto = icms.calcular(valor);
        } else if (opcao == 2) {
            valorImposto = iss.calcular(valor);
        } else if (opcao == 3) {
            valorImposto = ipi.calcular(valor);
        } else {
            System.out.println("Opção inválida!");
            scanner.close();
            return;
        }

        System.out.printf("Valor do produto: R$ %.2f%n", valor);
        System.out.printf("Valor do imposto: R$ %.2f%n", valorImposto);

        scanner.close();
    }
}
