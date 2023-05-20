package stacktrace;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada");

                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na compra: " + e.getMessage());
            } catch (IllegalStateException ise) {
                System.out.println("Erro na compra: " + ise.getMessage());

                System.out.println("Deseja ativar o produto? ");

                if (scanner.nextBoolean()) {
                    produto.ativar();
                    System.out.println("Ok. Produto já foi ativado");
                } else {
                    System.out.println("Ok Compra não pode ser realizada");
                    break;
                }
            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidade retiradas do estoque. Estoque atual: %d%n",
                quantidade, produto.getQuantidadeEstoque());
    }
}
