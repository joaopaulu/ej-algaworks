package desafios;

import java.util.Scanner;

public class SimuladorEmprestimo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = scanner.nextDouble();

    System.out.println("Quantidade de parcela: ");
    int quantidadeParcelas = scanner.nextInt();

    double taxaJuros = switch (quantidadeParcelas) {
      case 1, 2 -> 1.99;
      case 3 -> 2.99;
      default -> 3.99;
    };

    double tarifaFixa = valorEmprestimo >= 100 ? 1.50 : 0;
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
  }

}
