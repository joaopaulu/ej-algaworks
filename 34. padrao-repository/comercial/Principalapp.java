package comercial;

import comercial.entidade.Venda;
import comercial.repositorio.VendaRepositorio;
import comercial.servico.CadastroVendaServico;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Principalapp {

	public static void main(String[] args) {
		var vendaRepositorio = new VendaRepositorio();
		var cadastroVendaServico = new CadastroVendaServico();
		Venda vendaCadastrada = cadastroVendaServico.cadastrar("José da Silva",
				new BigDecimal("12300.87"), LocalDate.parse("2023-04-19"));

		System.out.println("Venda cadastrada: " + vendaCadastrada);

		System.out.println("Listando todas as vendas:");
		var todasVendas = vendaRepositorio.consultar();
		todasVendas.forEach(System.out::println);
	}

}
