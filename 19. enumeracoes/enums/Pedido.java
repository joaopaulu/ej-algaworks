package enums;

public class Pedido {
   private String nomeCliente;
   private double valorTotal;
   private StatusPedido status = StatusPedido.ENTREGUE;
   private OrigemPedido origem = OrigemPedido.BALCAO;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getTempoEntregaEmHoras(){
        return status.getTempoEntregaEmHoras();
    }

    public void marcarComoEntregue(){
        status = StatusPedido.EMITIDO;
    }

    public void cancelar(){
        if(getStatus().podeMudarParaCancelado(getValorTotal())){
            status = StatusPedido.CANCELADO;
        }else{
            throw new IllegalArgumentException("Pedido não pode ser cancelado");
        }
    }
}
