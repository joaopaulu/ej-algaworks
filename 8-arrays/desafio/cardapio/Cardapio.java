package desafio.cardapio;

import java.util.Arrays;

public class Cardapio {
  ItemCardapio[] itens = new ItemCardapio[0];

  void adicionarItem(ItemCardapio item) {
    itens = Arrays.copyOf(itens, itens.length + 1);
    itens[itens.length - 1] = item;
  }

  void removerItem(int indice) {
    ItemCardapio[] itensNovos = new ItemCardapio[itens.length - 1];
    System.arraycopy(itens, 0, itensNovos, 0, indice);
    System.arraycopy(itens, indice + 1, itensNovos, indice, itensNovos.length - indice);
    itens = itensNovos;
  }

  void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
    for (ItemCardapio item : itens) {
      if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
        System.out.println(item.descricao + " " + item.preco);
      }
    }
  }
}
