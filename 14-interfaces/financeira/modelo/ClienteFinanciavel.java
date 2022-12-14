package financeira.modelo;

public interface ClienteFinanciavel {

	double JUROS_BAIXO_RISCO = 1.0;
	double JUROS_MEDIO_RISCO = 1.5;
	double JUROS_ALTO_RISCO = 2.0;

	double calcularLimiteAprovado();

	default double calcularJuros(double valorSolitado){
		if (isFinanciamentoPequenoValor(valorSolitado)) {
			return JUROS_BAIXO_RISCO;
		} else if (isFinanciamentoGrandeValor(valorSolitado)) {
			return JUROS_MEDIO_RISCO;
		}
		return JUROS_ALTO_RISCO;
	}

	static boolean isFinanciamentoGrandeValor(double valorSolitado) {
		return valorSolitado <= 1_000_000;
	}

	static boolean isFinanciamentoPequenoValor(double valorSolitado) {
		return valorSolitado <= 100_000;
	}
}
