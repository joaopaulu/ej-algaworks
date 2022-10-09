package desafios;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean isBissexto = ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0;

        System.out.printf("Este ano é Bissexto? %b%n", isBissexto );
        scanner.close();
    }
}
