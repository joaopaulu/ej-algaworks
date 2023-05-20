import java.util.Scanner;

public class ExameVitaminaD {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Grupo de risco: ");
    boolean grupoDeRisco = scanner.nextBoolean();

    System.out.print("Vitamina D: ");
    double vitaminaD = scanner.nextDouble(); // nanograma por mililitro

    boolean vitaminaDNormal = (!grupoDeRisco && vitaminaD > 20)
            || (grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60);

    System.out.printf("Vitamina D normal: %b%n", vitaminaDNormal);

  }

}
