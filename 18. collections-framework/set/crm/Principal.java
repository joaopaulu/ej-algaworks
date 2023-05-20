package set.crm;

import java.util.Set;
import java.util.TreeSet;

public class Principal {
    public static void main(String[] args) {
        Set<Contato> contatos = new TreeSet<>();

        System.out.println("---");
        contatos.add(new Contato("Maria", "maria@algaworks.com", 40));
        contatos.add(new Contato("Ana", "ana@algaworks.com", 30));
        contatos.add(new Contato("José", "jose@algaworks.com", 25));
        contatos.add(new Contato("Rosa", "rosa@algaworks.com", 50));
        contatos.add(new Contato("João", "joao@algaworks.com", 70));
        System.out.println("---");

//        System.out.println(contatos);

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
