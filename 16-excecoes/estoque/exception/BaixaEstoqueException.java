package estoque.exception;

public class BaixaEstoqueException extends Exception {
    public BaixaEstoqueException(String messagem, Throwable cause){
        super(messagem, cause);
    }
}
