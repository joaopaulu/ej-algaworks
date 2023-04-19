package temporais.durations.calc;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Principal1 {
    public static void main(String[] args) {
        LocalDateTime dataHoraCompra = LocalDateTime.parse("2023-04-01T15:15:00");
        LocalDateTime dataHoraEntrega = LocalDateTime.parse("2023-06-01T15:15:00");

        Duration tempoEntrega = Duration.between(dataHoraCompra, dataHoraEntrega);
        System.out.println(tempoEntrega);

        long tempoEntregaSegundos = ChronoUnit.SECONDS.between(dataHoraCompra, dataHoraEntrega);
        System.out.println(tempoEntregaSegundos);
    }
}
