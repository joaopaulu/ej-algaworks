package companhiaAerea;

public class Aeronave {
  boolean ativo = true;
  int totalAssentos;
  int assentosReservados;

  int calcularAssentosDisponiveis() {
    return totalAssentos - assentosReservados;
  }

  void reservarAssentos(int numeroAssentos){
    if(ativo){
      assentosReservados += numeroAssentos;
    } else {
      System.out.println("Aeronave desativada. Assentos não reservados.");
    }
  }

  void desativar() {
    ativo = false;
  }

  void ativar() {
    ativo = true;
  }
}
