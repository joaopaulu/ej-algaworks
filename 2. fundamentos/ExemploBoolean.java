public class ExemploBoolean {
  public static void main(String[] args) {
    boolean compraAprovada = true;
    boolean clienteBloqueado = false;

    System.out.println(compraAprovada);
    System.out.println(clienteBloqueado);

    int quantidadeEstoque = 10;
    int quantidadePepidoCompra = 15;

    boolean estoqueSuficiente = quantidadeEstoque >= quantidadePepidoCompra;
    System.out.println("Estoque suficiente: " + estoqueSuficiente);
  }
}
