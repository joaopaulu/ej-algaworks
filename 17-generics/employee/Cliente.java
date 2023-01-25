package employee;

public class Cliente implements Nomeavel, PessoaJuridica{
    private String razaoSocial;
    private double faturamentoMensal;

    public Cliente(String razaoSocial, double faturamentoMental) {
        this.razaoSocial = razaoSocial;
        this.faturamentoMensal = faturamentoMental;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getFaturamentoMental() {
        return faturamentoMensal;
    }

    public void setFaturamentoMental(double faturamentoMental) {
        this.faturamentoMensal = faturamentoMental;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", faturamentoMensal=" + faturamentoMensal +
                '}';
    }

    @Override
    public String getNome() {
        return getRazaoSocial();
    }
}
