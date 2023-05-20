public class OperadoreesComparacao {
    public static void main(String[] args) {
        int pesoProdutos = 900;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
        System.out.printf("Cargga liberada: %b%n", cargaExcedida);

        boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;
        System.out.printf("Carga liberada: %b%n", cargaLiberada);
    }

}
