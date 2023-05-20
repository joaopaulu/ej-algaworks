package banco;

import polibanco.ContaEspecial;
import polibanco.Titular;

public class PrincipalTest {
    public static void main(String[] args) {
        polibanco.Titular titular = new Titular("João Paulo", "00479309183");
        polibanco.ContaEspecial conta1 = new ContaEspecial(titular, 001, 251635, 90);

        System.out.println("Sua conta: " + conta1);
    }
}
