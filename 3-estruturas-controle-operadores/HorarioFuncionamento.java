import java.util.Scanner;

public class HorarioFuncionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
        String diaSemana = scanner.nextLine();
        String horarioFuncionamento = switch (diaSemana) {
            case "seg" -> "Fechado";
            case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
            case "sab", "dom" -> "08:00 às 12:00";
            default -> "Dia inválido";
        };

        System.out.printf("Horário dee funcionamento: %s%n", horarioFuncionamento);
    }
}
