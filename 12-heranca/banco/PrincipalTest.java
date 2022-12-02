package banco;

public class PrincipalTest {
    public static void main(String[] args) {
        Titular titular = new Titular("João Paulo", "00479309183");
        ContaEspecial conta1 = new ContaEspecial(titular, 001, 251635, 90);

        System.out.println("Sua conta: " + conta1);
    }
}
