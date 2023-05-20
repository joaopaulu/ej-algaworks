package desafios;

import java.util.Scanner;

public class DesafioIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Peso: ");
        int peso = scanner.nextInt();

        System.out.println("Altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Sexo: [M - Masculino | F - Feminino]");
        char sexo = scanner.next().charAt(0);

        double imc = peso / (altura * altura);

        if ((sexo == 'F' && imc < 19.1 ) || (sexo == 'M' && imc < 20.7)){
            System.out.println("Abaixo do peso.");
        }else if ((sexo == 'F' && imc < 25.8 ) || (sexo == 'M' && imc < 26.4)){
            System.out.println("No Peso ideal.");
        }else if ((sexo == 'F' && imc < 27.3 ) || (sexo == 'M' && imc < 27.8)){
            System.out.println("Um pouco acima do peso.");
        }else if ((sexo == 'F' && imc < 32.3 ) || (sexo == 'M' && imc < 31.1)){
            System.out.println("Acima do peso ideal.");
        }else {
            System.out.println("Obeso.");
        }

        System.out.println("Fim");
    }
}
