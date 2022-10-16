public class TestaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "City";
        meuCarro.precoCompra = 11950;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2010;
        seuCarro.cor = "Braco";
        seuCarro.fabricante = "Renault";
        seuCarro.modelo = "Logan";
        seuCarro.precoCompra = 50000;

       double valorRevenda = meuCarro.calcularValorRevenda();
       System.out.println(valorRevenda);
        
       // seuCarro.calcularValorRevenda();
    }
}
