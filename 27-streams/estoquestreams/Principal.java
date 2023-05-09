package estoquestreams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        boolean temProdutoComEstoque = produtos.stream()
                .peek(System.out::println)
                .filter(Produto::temEstoque)
//                .sorted(Comparator.comparingInt(Produto::getQuantidade))
                .anyMatch(Produto::temEstoque);

        System.out.println(temProdutoComEstoque);
    }

}
