package estruturadedados;

public class Principal {
    public static void main(String[] args) {
        Pilha<Produto> pilha = new Pilha<>();
        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("Feijão"));

        Produto produto = pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = pilha.retirar();
        System.out.println(produto.getDescricao());
    }
}
