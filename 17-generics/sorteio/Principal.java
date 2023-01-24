package sorteio;

public class Principal {
    public static void main(String[] args) {
        String[] nomes = {"João", "José", "Maria"};
        String nomeSorteado = Sorteador.sortear(nomes);
        System.out.println(nomeSorteado);

        Cliente[] clientes = {
                new Cliente("Tatico", 2_000_000),
                new Cliente("Dom Albertus", 5_000),
                new Cliente("AMusical", 10_000)
        };
        Cliente clienteSorteado = Sorteador.sortear(clientes);
        System.out.println(clienteSorteado.getRazaoSocial());
    }
}
