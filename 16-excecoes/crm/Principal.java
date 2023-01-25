package crm;

import employee.Cliente;

public class Principal {
    public static void main(String[] args) {
        ServicoCadastroCliente servicoCadastroCliente = new ServicoCadastroCliente();
        Cliente clienteCadastro = servicoCadastroCliente.cadastrar("João", 15);

        System.out.printf("Cliente cadastrado: %s%n", clienteCadastro.getNome());
    }
}
