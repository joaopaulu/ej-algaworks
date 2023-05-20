package banco;

import polibanco.Conta;
import polibanco.Titular;

public class Principal {
		public static void main(String[] args) {
				polibanco.Titular titular = new Titular("João Paulo", "00479309183");
				polibanco.Conta conta1 = new Conta(titular, 001, 251635);

				conta1.depositar(100);

				conta1.imprimirDemonstrativo();

				conta1.sacar(15);
				conta1.imprimirDemonstrativo();

				conta1.imprimirDemonstrativo();
		}
}
