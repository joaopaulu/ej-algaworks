package portaria;

import static portaria.Visitante.IDADE_MINIMA_ACESSO;

public class Principal {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "JP";
        novoVisitante.idade = 15;

        if(novoVisitante.possuiAcessoPorIdade()){
            System.out.printf("Acesso não permitido para menores de %d anos", IDADE_MINIMA_ACESSO);
        }else{
            System.out.println("Acesso Liberado");
        }
    }
}
