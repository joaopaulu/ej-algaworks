package bancoapp.negocio;

public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String message) {
		super(message);
	}

}
