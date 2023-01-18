package estoque.exception;

public class ProdutoSemEstoqueException extends ProdutoException {

    private final int estoqueDisponivel;
    private final int estoqueNecessario;

    public ProdutoSemEstoqueException(String message, int estoqueDisponivel, int estoqueNecessasrio) {
        super(message);
        this.estoqueDisponivel = estoqueDisponivel;
        this.estoqueNecessario = estoqueNecessasrio;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public int getEstoqueNecessario() {
        return estoqueNecessario;
    }
}
