public class OperadoresComparacao {
  public static void main(String[] args) {
    int pesoProdutos = 1000;
    int limitePesoCaminhao = 1000;

    boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
    System.out.printf("Carga excedida: %b%n", cargaExcedida);

    boolean cargaLiberada = limitePesoCaminhao >= pesoProdutos;
    System.out.printf("Carga liberada: %b%n", cargaLiberada);
  }
}
