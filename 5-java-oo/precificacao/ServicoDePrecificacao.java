package precificacao;

public class ServicoDePrecificacao {
  void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
    produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) +1);
  }
}
