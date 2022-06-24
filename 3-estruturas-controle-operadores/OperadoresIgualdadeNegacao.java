public class OperadoresIgualdadeNegacao {
  public static void main(String[] args) {
    int numero1 = 10;
    int numero2 = 11;

    boolean numerosIguais = numero1 == numero2;
    boolean numerosDiferentes = numero1 != numero2;

    System.out.printf("Números iguais: %b%n", numerosIguais);
    System.out.printf("Números diferentes: %b%n", numerosDiferentes);
  }
}