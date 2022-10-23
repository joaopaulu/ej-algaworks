package portaria;

public class Principal {
    public static void main(String[] args) {
        var novoVisitante = new Visitante();
        novoVisitante.nome = "JP";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 10);
    }
}
