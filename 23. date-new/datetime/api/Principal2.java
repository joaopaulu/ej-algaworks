package datetime.api;

import java.time.LocalDateTime;

public class Principal2 {
	public static void main(String[] args) {
		LocalDateTime dataVencimento = LocalDateTime.parse("2023-12-24T22:40:13");

		System.out.println(dataVencimento.getDayOfMonth());
		System.out.println(dataVencimento.getHour());
		System.out.println(dataVencimento.getMinute());
	}
}
