package cartaobeneficio.servico;

import cartaobeneficio.Cartao;
import cartaobeneficio.Estabelecimento;
import cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {
    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){
        if(cartao.getSaldo() < valor){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.setSaldo(cartao.getSaldo() - valor);

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
