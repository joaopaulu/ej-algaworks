import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Peso: ");
        int peso = scanner.nextInt();

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Abaixo do peso ideal.");
        }else if (imc < 25){
            System.out.println("Acima do peso.");
        }else if (imc < 35){
            System.out.println("Obesidade grau I.");
        }else if (imc < 40){
            System.out.println("Obesidade grau II.");
        }else {
            System.out.println("Obesidade grau III.");
        }

        System.out.println("Fim");
    }
}
