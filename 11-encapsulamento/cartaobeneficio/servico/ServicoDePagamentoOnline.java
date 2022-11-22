package cartaobeneficio.servico;

import cartaobeneficio.Cartao;
import cartaobeneficio.Estabelecimento;
import cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){

        cartao.debitar(valor);

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
