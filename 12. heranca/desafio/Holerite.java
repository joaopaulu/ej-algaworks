package desafio;

public class Holerite {
    private String nome;
    private String mesAno;
    private double valorSalario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMesAno() {
        return mesAno;
    }

    public void setMesAno(String mesAno) {
        this.mesAno = mesAno;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Holerite(String nome, String mesAno, double valorSalario) {
        this.nome = nome;
        this.mesAno = mesAno;
        this.valorSalario = valorSalario;
    }

    public void imprimir(){
        System.out.println();
        System.out.printf("Nome: %d%n", getNome());
        System.out.printf("Mes e ano: %d%n", getMesAno());
        System.out.printf("Valor Salário: %s%n", getValorSalario());
    }
}
