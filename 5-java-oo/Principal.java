public class Principal {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "João Paulo";
        eu.cpf = "004.793.091-83";
        eu.anoNascimento = 1985;

        Pessoa voce = new Pessoa();
        voce.nome = "Valéria";
        voce.cpf = "736.446.501-44";
        voce.anoNascimento = 1987;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "City";
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Braco";
        seuCarro.fabricante = "Renault";
        seuCarro.modelo = "Logan";
        seuCarro.proprietario = voce;

        System.out.println("Meu Carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu Carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);

    }
}
