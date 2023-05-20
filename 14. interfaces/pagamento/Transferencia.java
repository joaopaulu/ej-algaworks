package pagamento;

public class Transferencia implements MetodoPagamento{
	@Override
	public void pagar(DocumentoPagavel documento) {
		Beneficiario beneficiario = documento.getBeneficiario();

		if(beneficiario.naoPossuiContaBancaria()){
			throw new RuntimeException("Beneficiário não possui conta bancária");
		}
		System.out.printf("DEBUG: Efetuando transferência para %s no valor de %.2f com a chave %s%n",
				beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());
	}
}
