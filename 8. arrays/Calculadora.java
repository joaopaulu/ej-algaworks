public class Calculadora {
    static double calcularMedia(int[] numeros){
        int total = 0;

        for (int numero : numeros) {
            total += numero;
        }

        return (double) total / numeros.length;
    }
}
