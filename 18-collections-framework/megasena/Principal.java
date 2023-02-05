package megasena;

public class Principal {
    public static void main(String[] args) {
        Sorteador sorteador = new Sorteador();

        for(Integer i : sorteador){
            System.out.println(i);
        }
    }
}
