package desafios;

import java.util.Scanner;

public class DesafioFor01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaNumeros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite um numero par: %d/10%n ", i);
            int numerosPares = scanner.nextInt();
            if (numerosPares % 2 == 0) {
                somaNumeros += numerosPares;
            } else {
                System.out.println("Digite apenas numeros pares");
                i--;
            }

        }
        System.out.printf("A soma dos 10 números pares é: %d%n ", somaNumeros);
    }
}
