public class Principal2 {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario();
    funcionario.idade = Integer.valueOf(20);

    System.out.printf("Idade: %d%n", funcionario.idade);
  }
}
