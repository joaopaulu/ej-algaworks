package estoque;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Mac Book Air Pro");
        produto.adicionarEstoque(10);
        produto.ativar();

        produto.retirarEstoque(5);

        System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());
    }
}
