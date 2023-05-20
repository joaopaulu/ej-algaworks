package util;

public class Principal {
    public static void main(String[] args) {

        double areaQuadrado = CalculadoraArea.calcularAreaQuadrado(40);
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(70.2);

        System.out.printf("PI: %.2f%n", CalculadoraArea.PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do circulo: %.2f%n", areaCirculo);


    }
}
