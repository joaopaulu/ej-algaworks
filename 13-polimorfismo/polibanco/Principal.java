package polibanco;

public class Principal {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("JP", "00479309183"),
                6397, 25163, 50);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("Chico", "05464312390"),
                6397, 25163);
        conta2.depositar(100);
        conta2.creditarRendimentos(10);

        caixaEletronico.imprimirDemonstrativo(conta2);



    }
}
