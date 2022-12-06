package fiscal;

public class Principal {
	public static void main(String[] args) {
		var gestorFiscal = new GestorFiscal();
		var nfBola = new NotaFiscalProduto("Bola Futebol", 300, 50);
		var nfMotor = new NotaFiscalServico("Reparo Roda", 900,true);

		gestorFiscal.emitirNotasFiscais(nfBola, nfMotor);

		//System.out.println(nfBola.calcularImpostos());
		//System.out.println(nfMotor.calcularImpostos());
	}
}
