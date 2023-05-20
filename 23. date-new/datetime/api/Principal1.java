package datetime.api;

import java.time.LocalDate;

public class Principal1 {
	public static void main(String[] args) {
		LocalDate dataVencimento = LocalDate.parse("2023-12-24");

		System.out.println(dataVencimento.getDayOfMonth());
		System.out.println(dataVencimento.getMonth());
		System.out.println(dataVencimento.getYear());
	}
}
