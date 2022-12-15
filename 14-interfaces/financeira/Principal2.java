package financeira;

import financeira.modelo.Funcionario;
import financeira.servico.ServicoPagamentoBonus;

public class Principal2 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João Paulo", 18_000);

        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 80);

    }


}
