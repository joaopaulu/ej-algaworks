package locadora;

public class Principal {
	public static void main(String[] args) {
		Notebook notebook = new Notebook("Macbook Pro i7 16Gb", 5, 100);

		Locacao locacao = new LocacaoPorDiaSeguroSantander(notebook);
		double valorDevido = locacao.calcularValorDevido(10);

		System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
	}
}
