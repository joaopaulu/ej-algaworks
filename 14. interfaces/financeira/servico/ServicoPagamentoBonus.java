package financeira.servico;

import financeira.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

	public void pagar(PessoaBonificavel pessoa, double percetualMetaAlcancada){
		double valorBonus = pessoa.calcularBonus(percetualMetaAlcancada);
		System.out.printf("DEBUG: Bônus pago no valor de %.2f", valorBonus);
	}
}
