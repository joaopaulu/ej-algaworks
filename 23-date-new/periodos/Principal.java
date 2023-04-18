package periodos;

import java.time.Period;

public class Principal {
	public static void main(String[] args) {
		Period periodo = Period.parse("P2Y5M10D");
		System.out.println(periodo);

		Period periodoCalculado = periodo.multipliedBy(3).normalized();
		System.out.println(periodoCalculado);

		String periodoFormatado = String.format("%d anos, %d meses e %d dias",
				periodoCalculado.getYears(), periodoCalculado.getMonths(),
				periodoCalculado.getDays());
		System.out.println(periodoFormatado);
	}

}
