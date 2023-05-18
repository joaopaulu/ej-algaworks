package bancoapp.negocio;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;;

public class ContaCorrente {

	private final Titular titular;
	private final int agencia;
	private final int numero;
	private BigDecimal saldo = BigDecimal.ZERO;

	public ContaCorrente(Titular titular, int agencia, int numero) {
		Objects.requireNonNull(titular);
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
	}

	public Titular getTitular() {
		return titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public final BigDecimal getSaldo() {
		return saldo;
	}

	protected void validarSaldoParaSaque(BigDecimal valorSaque) {
		if (getSaldo().compareTo(valorSaque) < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente para saque");
		}
	}

	public void sacar(BigDecimal valorSaque) {
		Objects.requireNonNull(valorSaque);

		if (valorSaque.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
		}

		validarSaldoParaSaque(valorSaque);

		saldo = saldo.subtract(valorSaque);

		System.out.printf("%s - %s - Saque de R$%.2f realizado na conta %s%n",
				LocalDateTime.now(), ContaCorrente.class.getName(),
				valorSaque, getAgencia() + "/" + getNumero());
	}

	public final void depositar(BigDecimal valorDeposito) {
		Objects.requireNonNull(valorDeposito);

		if (valorDeposito.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
		}

		saldo = saldo.add(valorDeposito);

		System.out.printf("%s - %s - Depósito de R$%.2f realizado na conta %s%n",
				LocalDateTime.now(), ContaCorrente.class.getName(),
				valorDeposito, getAgencia() + "/" + getNumero());
	}

	public void imprimirDemonstrativo() {
		System.out.println();
		System.out.printf("Agência: %d%n", getAgencia());
		System.out.printf("Conta: %d%n", getNumero());
		System.out.printf("Titular: %s%n", getTitular().getNome());
		System.out.printf("Saldo: %.2f%n", getSaldo());
	}

	@Override
	public String toString() {
		return "Conta{" +
				"titular=" + titular +
				", agencia=" + agencia +
				", numero=" + numero +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ContaCorrente contaCorrente = (ContaCorrente) o;
		return agencia == contaCorrente.agencia && numero == contaCorrente.numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero);
	}

}
