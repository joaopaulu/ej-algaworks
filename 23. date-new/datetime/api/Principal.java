package datetime.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
	public static void main(String[] args) {
		LocalDateTime dataHora = LocalDateTime.now();

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss");

		System.out.println(dataHora.format(formatador));
	}
}
