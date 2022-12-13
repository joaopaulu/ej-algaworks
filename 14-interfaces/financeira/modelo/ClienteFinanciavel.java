package financeira.modelo;

public interface ClienteFinanciavel {

	double calcularLimiteAprovado();

	default double calcularJuros(double valorSolitado){
		if (valorSolitado <= 100_000) {
			return 1.0;
		} else if (valorSolitado <= 1_000_000) {
			return 1.5;
		}
		return 2.0;
	}
}
