package cartaobeneficio.servico;

import cartaobeneficio.Cartao;
import cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {
    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO)
            );
        }
        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Depósito", valorDeposito);
    }
}
