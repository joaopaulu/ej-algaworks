package contaspagar.pagamento;

public interface DocumentoPagavel {

    public abstract double getValorTotal();

    Beneficiario getBeneficiario();
}
