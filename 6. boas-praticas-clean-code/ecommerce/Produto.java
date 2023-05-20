package ecommerce;

public class Produto {
  String nome;
  double precoUnitario;
  boolean ativo;

  void alterarStatus(boolean ativo){
    if (ativo){
      System.out.printf("Ativando");
    }else{
      System.out.printf("Desativando");
    }

    this.ativo = ativo;
  }

  void ativar(){
    System.out.printf("Ativando");
    this.ativo = true;
  }

  void desativar(){
    System.out.printf("Desativando");
    this.ativo = false;
  }
}
