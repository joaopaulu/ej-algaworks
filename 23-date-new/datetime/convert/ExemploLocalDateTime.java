package datetime.convert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime dataHora = LocalDateTime.parse("03/10/2026 21:05:20",
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

		System.out.println(dataHora);
	}
}
