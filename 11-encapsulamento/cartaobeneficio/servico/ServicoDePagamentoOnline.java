package cartaobeneficio.servico;

import cartaobeneficio.Cartao;
import cartaobeneficio.Estabelecimento;
import cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){
        if(cartao.saldo < valor){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.saldo -= valor;

        return new Recibo(cartao.titular, "Pagamento", valor);
    }
}
