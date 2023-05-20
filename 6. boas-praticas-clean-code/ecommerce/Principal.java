package ecommerce;

public class Principal {
  public static void main(String[] args) {
    CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

    Produto produto = new Produto();
    produto.nome = "Água";
    produto.precoUnitario = 2.5;

    carrinho.adicionarItem(produto, 5);

    produto.ativar();
    produto.desativar();
  }
}
