package intro;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Supermercado Pague e Leve", 2_000_000));
        clientes.add(new Cliente("Posto Gasolina Chico 10", 800_00));

        double totalFatufamento = 0d;

        for (Cliente cliente : clientes){
            totalFatufamento += cliente.getFaturamentoMensal();
        }
        System.out.println(totalFatufamento);
    }
}
