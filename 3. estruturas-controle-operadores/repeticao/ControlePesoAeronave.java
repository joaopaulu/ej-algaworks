package repeticao;

import java.util.Scanner;

public class ControlePesoAeronave {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Peso máximo da aeronave: ");
    int pesoMaximo = scanner.nextInt();

    System.out.println("Quantidade de passageiros: ");
    int totalPassageiros = scanner.nextInt();

    int pesoTotalPassageiros = 0;

    for (int passageiroAtual = 1; passageiroAtual <= totalPassageiros; passageiroAtual++){
      System.out.printf("Peso do passageiro #%d: ", passageiroAtual);
      int pesoPassageiro = scanner.nextInt();

      pesoTotalPassageiros += pesoPassageiro;
    }

    System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situação da aeronave: %s%n",
            pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
  }

}
