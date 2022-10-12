package repeticao;

import java.util.Scanner;

public class ControlePesoAeronaveWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Peso máximo da aeronave: ");
    int pesoMaximo = scanner.nextInt();

    int pesoTotalPassageiros = 0;
    boolean incluirNovoPassageiro = true;

    //while
    while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro){
      System.out.println("Peso do Passageiro: ");
      int pesoPassageiro = scanner.nextInt();

      pesoTotalPassageiros += pesoPassageiro;

      System.out.print("Incluir novo passageiro? ");
      incluirNovoPassageiro = scanner.nextBoolean();
    }

    System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situação da aeronave: %s%n",
            pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
  }

}
