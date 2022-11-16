package chamandoConstrutor;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Monitor DEll 52");
        Produto produto2 = new Produto("Mouse", 10);
        Produto produto3 = new Produto();

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);

        System.out.println(produto3.nome);
        System.out.println(produto3.quantidadeEstoque);
    }
}
