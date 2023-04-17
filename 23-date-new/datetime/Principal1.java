package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal1 {
	public static void main(String[] args) {
		LocalDate data = LocalDate.of(1985,02,12);
		LocalTime hora = LocalTime.of(10,00,00);

		LocalDateTime dataHora = hora.atDate(data);

		System.out.println(dataHora);
	}
}
