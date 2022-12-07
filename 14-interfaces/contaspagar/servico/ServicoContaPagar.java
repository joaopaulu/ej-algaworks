package contaspagar.servico;

import pagamento.DocumentoPagavel;
import pagamento.MetodoPagamento;
import pagamento.Pix;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento){

        metodoPagamento.pagar(documento);
    }
}
