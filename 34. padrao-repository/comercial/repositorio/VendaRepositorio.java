package comercial.repositorio;

import comercial.entidade.Venda;

import java.util.List;

public interface VendaRepositorio {
	Venda adicionar(Venda venda);

	List<Venda> consultar();
}
