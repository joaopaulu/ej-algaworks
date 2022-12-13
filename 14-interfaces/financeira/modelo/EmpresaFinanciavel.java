package financeira.modelo;

public abstract class EmpresaFinanciavel extends Empresa implements ClienteFinanciavel {

	public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
		super(razaoSocial, totalFaturamento);
	}

	@Override
	public double calcularJuros(double valorSolitado) {
		return 0.8;
	}
}
