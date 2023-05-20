package desafio.cardapio;

public class Principal {
  public static void main(String[] args) {
    Cardapio cardapio = new Cardapio();

    ItemCardapio item1 = new ItemCardapio();
    item1.descricao = "Mac Book";
    item1.preco = 10000;

    ItemCardapio item2 = new ItemCardapio();
    item2.descricao = "Notebook Dell";
    item2.preco = 5000;

    cardapio.adicionarItem(item1);
    cardapio.adicionarItem(item2);
    //cardapio.removerItem(1);

    cardapio.imprimirItensCardapio(2, 10000);
  }
}
