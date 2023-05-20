package desafio;

public class Programador extends Funcionario{
    private double valorBonus;

    public Programador(String nome, double valorHora, double valorBonus) {
        super(nome, valorHora);
        this.valorBonus = valorBonus;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }
}
