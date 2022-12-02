package banco;

public class PrincipalEspecial {
    public static void main(String[] args) {
        Titular titular = new Titular("João Paulo", "00479309183");
        ContaEspecial conta1 = new ContaEspecial(titular, 001, 251635, 90);
        conta1.depositar(1000);
        conta1.setTarifaMensal(90);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }
}
