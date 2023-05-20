package desafios.programaMilhas;

import java.util.Objects;

public class Participante {
    String nome;
    int saldoDePontosInicial;

    Participante(String nome){
        this.nome = nome;
    }

    Participante(String nome, int saldoDePontosInicial){
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if(saldoDePontosInicial < 0){
            throw new IllegalArgumentException("O Saldo não pode ser negativo!");
        }
        this.nome = nome;
        this.saldoDePontosInicial = saldoDePontosInicial;
    }
}
