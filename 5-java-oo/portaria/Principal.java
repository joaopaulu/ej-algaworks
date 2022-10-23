package portaria;

public class Principal {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "JP";
        novoVisitante.idade = 15;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante, 10);
    }
}
