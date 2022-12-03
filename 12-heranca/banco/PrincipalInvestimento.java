package banco;

import polibanco.ContaInvestimento;
import polibanco.Titular;

public class PrincipalInvestimento {
    public static void main(String[] args) {
        polibanco.Titular titular = new Titular("João Paulo", "00479309183");
        polibanco.ContaInvestimento conta1 = new ContaInvestimento(titular, 001, 251635);

        conta1.depositar(100);

        conta1.imprimirDemonstrativo();

        conta1.sacar(10);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }
}
