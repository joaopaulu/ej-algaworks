package desafio.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
  List<ItemCardapio> itens = new ArrayList<>();

  void adicionarItem(ItemCardapio item) {
    itens.add(item);
  }

  void removerItem(int indice) {
    itens.remove(indice);
  }

  void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
    for (ItemCardapio item : itens) {
      if (item.preco >= precoMinimo && item.preco <= precoMaximo) {
        System.out.println(item.descricao + " " + item.preco);
      }
    }
  }
}
