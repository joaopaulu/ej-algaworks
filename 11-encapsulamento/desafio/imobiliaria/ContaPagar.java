package desafio.imobiliaria;

import java.io.Serializable;

public class ContaPagar implements Serializable {
    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void pagar() {
        if (isPago()) {
            throw new RuntimeException("Essa conta já foi paga!");
        } else {
            pago = true;
        }
    }

    public void cancelarPagamento() {
        if (!isPago()) {
            throw new RuntimeException("Essa conta já foi cancelada!");
        } else {
            pago = false;
        }
    }
}
