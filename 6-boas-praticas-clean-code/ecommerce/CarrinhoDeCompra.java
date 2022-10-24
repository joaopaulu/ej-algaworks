package ecommerce;

public class CarrinhoDeCompra {

  public static final double TAXA_SERVICO_PADRAO = 0.10;

  int quantidadeItens;
  Produto produto;

  void realizarCompras(String numeroCartao){
    double valorTotal = calcularValorTotal();

    // boolean pagamentoAutorizado = Gatew

  }

  double calcularValorTotal() {
    double subtotal = calcularSubtotal();
    double taxaServico = calcularTaxaServico(subtotal);
    double valorTotal = subtotal + taxaServico;

    return valorTotal;
  }

  static double calcularTaxaServico(double subtotal) {
    return subtotal * TAXA_SERVICO_PADRAO;
  }

  double calcularSubtotal() {
    return produto.precoUnitario * quantidadeItens;
  }
}
