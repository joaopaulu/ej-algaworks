package desafios.geocalc;

public class Principal {
    public static void main(String[] args) {
        double areaQuadrado = FormulasGeograficas.calcularAreaQuadrado(4.5);
        double areaCirculo = FormulasGeograficas.calcularAreaCirculo(5);

        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do circulo: %.2f%n", areaCirculo);
    }
}
