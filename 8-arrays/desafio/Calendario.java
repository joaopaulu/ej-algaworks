package desafio;

public class Calendario {
  static String obterNomesMes(int numeroMes) {
    String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"};
    return mes[numeroMes - 1];
  }

  public static void main(String[] args) {
    String mes = Calendario.obterNomesMes(2);
    System.out.println(mes);
  }
}
