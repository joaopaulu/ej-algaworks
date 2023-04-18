package temporais;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DECADES;

public class Principal5 {
	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();

		LocalDate dataProximaParcela = ChronoUnit.DAYS.addTo(agora,30);
		LocalDate dataDecadaPassada = agora.minus(1, DECADES);

		System.out.println(agora);
		System.out.println(dataProximaParcela);
	}
}
