package banco;

public class Principal {
		public static void main(String[] args) {
				Conta conta1 = new Conta();
				conta1.setTitular(new Titular("João Paulo", "00479309183"));
				conta1.setAgencia(0001);
				conta1.setNumero(25165);
				conta1.depositar(13815.84);

				conta1.imprimirDemonstrativo();

				conta1.sacar(15000);
				conta1.imprimirDemonstrativo();

				conta1.imprimirDemonstrativo();
		}
}
