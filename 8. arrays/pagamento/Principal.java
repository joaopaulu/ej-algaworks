package pagamento;

public class Principal {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoDeCobranca servicoDeCobranca = new ServicoDeCobranca();

       /* String[] emailsCobranca = {"jptick@gmail.com", "maria@gmail.com"};
        servicoDeCobranca.pagar(fatura, emailsCobranca);*/

        servicoDeCobranca.pagar(fatura, "jptick@gmail.com");
    }
}
