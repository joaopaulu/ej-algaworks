package desafios.pet;

public class Principal {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();

        meuCachorro.nome = "Myke";
        meuCachorro.raca = "Vira Lara";
        meuCachorro.sexo = "Macho";
        meuCachorro.idade = 7;

        Cachorro seuCachorro = new Cachorro();

        seuCachorro.nome = "Suri";
        seuCachorro.raca = "Rusky";
        seuCachorro.sexo = "Femea";
        seuCachorro.idade = 3;

        System.out.println("Meu Cachorro");
        System.out.println("____________");
        System.out.println(meuCachorro.nome);
        System.out.println(meuCachorro.raca);
        System.out.println(meuCachorro.sexo);
        System.out.println(meuCachorro.idade);

        System.out.println();

        System.out.println("Seu Cachorro");
        System.out.println("____________");
        System.out.println(seuCachorro.nome);
        System.out.println(seuCachorro.raca);
        System.out.println(seuCachorro.sexo);
        System.out.println(seuCachorro.idade);
    }
}
