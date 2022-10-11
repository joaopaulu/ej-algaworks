import java.util.Scanner;

public class CaixaLoja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço dos produtos: ");
        double precoProdutos = scanner.nextDouble();

        System.out.print("Cobrar frete? ");
        boolean cobrarFrete = scanner.nextBoolean();

        double valorFrete = 0;
        if (cobrarFrete) {
            System.out.print("Valor do frete: ");
            valorFrete = scanner.nextDouble();
        }

        double valorTotal = precoProdutos + valorFrete;

        System.out.printf("Valor total: R$%.2f%n", valorTotal);

    }
}
