public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "City";

        Carro seuCarro = new Carro();

        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Braco";
        seuCarro.fabricante = "Renault";
        seuCarro.modelo = "Logan";

        System.out.println("Meu Carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);

        System.out.println();

        System.out.println("Seu Carro");
        System.out.println("----------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);

    }
}
