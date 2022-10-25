package ecommerce;

import java.util.Objects;

public class CarrinhoDeCompra {

  public static final double TAXA_SERVICO_PADRAO = 0.10;

  int quantidadeItens;
  Produto produto;

  void adicionarItem(String nomeProduto, double precoUnitario, int quantidade){

  }

  void adicionarItem(Produto produto, int quantidade){
    Objects.requireNonNull(produto, "Produto deve ser informado");

    if(quantidade <= 0){
      throw new IllegalArgumentException("Quantidade deve ser maior que 0");
    }
    System.out.printf("Produto: %s%n", produto.nome);
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
