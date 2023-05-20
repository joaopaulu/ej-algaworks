package desafios.comparaNumeros;

import static desafios.comparaNumeros.NumeroUtil.compararNumeros;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Desafio Sobrecarga de métodos");
        System.out.println("_____________________________");

        System.out.println("Primeiro método: " + compararNumeros(59,3));
        System.out.println("Segundo método: " + compararNumeros(59,3, 100));
        System.out.println("Terceiro método: " + compararNumeros(5.6,3.1));
        System.out.println("Quarto método: " + compararNumeros(20.1,37.1,60));
    }
}
