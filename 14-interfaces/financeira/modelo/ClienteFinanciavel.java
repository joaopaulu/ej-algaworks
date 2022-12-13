package financeira.modelo;

public interface ClienteFinanciavel {

	double calcularLimiteAprovado();

	default double calcularJuros(double valorSolitado){
		if (isFinanciamentoPequenoValor(valorSolitado)) {
			return 1.0;
		} else if (isFinanciamentoGrandeValor(valorSolitado)) {
			return 1.5;
		}
		return 2.0;
	}

	private static boolean isFinanciamentoGrandeValor(double valorSolitado) {
		return valorSolitado <= 1_000_000;
	}

	private static boolean isFinanciamentoPequenoValor(double valorSolitado) {
		return valorSolitado <= 100_000;
	}
}
