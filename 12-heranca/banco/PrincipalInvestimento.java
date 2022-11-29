package banco;

public class PrincipalInvestimento {
    public static void main(String[] args) {
        ContaInvestimento conta1 = new ContaInvestimento();
        conta1.setTitular(new Titular("João Paulo", "00479309183"));
        conta1.setAgencia(0001);
        conta1.setNumero(25165);
        conta1.depositar(13815.84);

        conta1.imprimirDemonstrativo();

        conta1.sacar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }
}
