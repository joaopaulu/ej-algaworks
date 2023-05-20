package desafios.comparaNumeros;

public class NumeroUtil {

    static int compararNumeros(int primeiroNumero, int segundoNumero){
        return Math.max(primeiroNumero, segundoNumero);
    }

    static int compararNumeros(int primeiroNumero, int segundoNumero, int terceiroNumero){
        return Math.max(primeiroNumero, Math.max(segundoNumero, terceiroNumero));
    }

    static double compararNumeros(double primeiroNumero, double segundoNumero){
        return Math.max(primeiroNumero, segundoNumero);
    }

    static double compararNumeros(double primeiroNumero, double segundoNumero, double terceiroNumero){
       return Math.max(primeiroNumero, Math.max(segundoNumero, terceiroNumero));
    }
}
