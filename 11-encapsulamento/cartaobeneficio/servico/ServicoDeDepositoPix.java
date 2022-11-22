package cartaobeneficio.servico;

import cartaobeneficio.Cartao;
import cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {
    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {

        cartao.debitar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }
}
