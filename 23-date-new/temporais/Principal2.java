package temporais;

import java.time.LocalDate;

public class Principal2 {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate semanaPassada = hoje.minusWeeks(1);

		System.out.println(hoje);
		System.out.println(semanaPassada);
	}
}
