package desafio.seguradora;

import desafio.seguradora.modelo.Caminhao;
import desafio.seguradora.modelo.CarroParticular;
import desafio.seguradora.modelo.ImovelResidencial;
import desafio.seguradora.servico.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("HR-V", 2022, 150_000);
        Caminhao caminhao = new Caminhao("Actros", 2021, 780_000, 4);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);
    }
}
