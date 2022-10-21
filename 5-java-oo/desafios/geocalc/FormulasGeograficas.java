package desafios.geocalc;

public class FormulasGeograficas {
    static double pi = 3.1415;

    static double calcularAreaQuadrado(double area){
        return area * area;
    }

    static double calcularAreaCirculo(double area){
        return calcularAreaQuadrado(area) * FormulasGeograficas.pi;
    }
}
