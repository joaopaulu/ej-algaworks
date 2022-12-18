package desafio.seguradora.modelo;

public abstract class VeiculoAutomotor  implements BemSeguravel{

    private String modelo;
    private int anoFabricacao;
    private double valorMercado;

    public VeiculoAutomotor(String modelo, int anoFabricaco, double valorMercado) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricaco;
        this.valorMercado = valorMercado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }
}
