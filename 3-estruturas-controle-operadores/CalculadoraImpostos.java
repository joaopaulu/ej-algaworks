public class CalculadoraImpostos {
    public static void main(String[] args) {
        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.30;

        double valorImpostos = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;

        System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
    }
}
