package portaria;

public class Visitante {

    static final int IDADE_MINIMA_ACESSO = 18;
    String nome;
    int idade;

    boolean possuiAcessoPorIdade(){
        return idade < IDADE_MINIMA_ACESSO;
    }
}
