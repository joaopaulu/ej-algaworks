import java.util.Scanner;

public class HorarioFuncionamento {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um dia da semana (ex: seg, ter, qua, etc): ");
    String diaSemana = entrada.nextLine();
    String horarioFuncionamento;

    switch (diaSemana) {
      case "seg" -> horarioFuncionamento = "Fechado";
      case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "8:00 às 18:00";
      case "sab","dom" -> horarioFuncionamento = "8:00 às 12:00";
      default -> horarioFuncionamento = "Dia inválido";
    }

    System.out.printf("Horario de funcionamento: %s%n", horarioFuncionamento);
  }
}
