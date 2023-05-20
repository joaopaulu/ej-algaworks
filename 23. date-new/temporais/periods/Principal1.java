package temporais.periods;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Principal1 {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.parse("2023-04-01");
        LocalDate dataEntrega = LocalDate.parse("2023-04-15");

        Period tempoEntrega = dataCompra.until(dataEntrega);
        System.out.println(tempoEntrega);

        long tempoEntregaSemanas = ChronoUnit.WEEKS.between(dataCompra, dataEntrega);
        System.out.printf("%d semanas%n", tempoEntregaSemanas);
    }
}
