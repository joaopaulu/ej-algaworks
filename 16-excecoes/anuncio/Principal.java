package anuncio;

public class Principal {
    public static void main(String[] args) {
        ServicoCadastroAnuncio servicoCadastroAnuncio = new ServicoCadastroAnuncio();
        servicoCadastroAnuncio.cadastrar("99", "Teste");

        System.out.println("Anúncio cadastro");
    }
}
