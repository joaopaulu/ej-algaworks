package desafio.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor{

    private int quantidadeEixos;

    public Caminhao(String modelo, int anoFabricaco, double valorMercado, int quantidadeEixos) {
        super(modelo, anoFabricaco, valorMercado);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos(){
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.2;

        valorPremio += getQuantidadeEixos() * 50;

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão %s ano %d, %d eixos, avaliado em R$%.2f",
                getModelo(), getAnoFabricacao(), getQuantidadeEixos(), getValorMercado());
    }

}
