package banco.javabank;

public class ContaCorrente implements Conta{
    private double saldo;

    @Override
    public double getSaldo() {
        return 0;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta conta, double valor) {
        sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        this.saldo -= valor;
    }
}
