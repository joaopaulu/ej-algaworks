package contaspagar;

import contaspagar.pagamento.DocumentoPagavel;
import contaspagar.servico.ServicoContaPagar;

public class Principal {
    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        //Implementar a Interface
        DocumentoPagavel documento = null;

        servicoContaPagar.pagar(documento);

    }
}
