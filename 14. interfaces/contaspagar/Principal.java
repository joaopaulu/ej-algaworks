package contaspagar;

import contaspagar.modelo.Holerite;
import contaspagar.modelo.OrdemServico;
import contaspagar.servico.ServicoContaPagar;
import pagamento.Beneficiario;
import pagamento.MetodoPagamento;
import pagamento.Transferencia;

public class Principal {
    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Transferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("João Paulo","00479309183", "251635");
        Holerite holerite = new Holerite(funcionario, 75, 168);

        Beneficiario fornecedor = new Beneficiario("Klica Soluções", "009812345676", "98223");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);


    }
}
