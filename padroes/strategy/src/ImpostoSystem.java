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
        double valorTotal = valor + valorImposto;

        // Arredondando para 2 casas decimais
        valorImposto = Math.round(valorImposto * 100.0) / 100.0;
        valorTotal = Math.round(valorTotal * 100.0) / 100.0;
        valor = Math.round(valor * 100.0) / 100.0;

        System.out.println("Valor do produto: R$ " + valor);
        System.out.println("Valor do imposto: R$ " + valorImposto);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}
