package polibanco;

public class PrincipalSalario {
		public static void main(String[] args) {
				Titular titular = new Titular("João Paulo", "00479309183");
				Conta conta = new ContaSalario(titular, 001, 251635, 15000);

		}
}
