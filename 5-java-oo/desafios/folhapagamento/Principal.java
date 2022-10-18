package desafios.folhapagamento;

public class Principal {
    public static void main(String[] args) {
        FolhaPagamento minhaFolha = new FolhaPagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João Paulo";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

        double horasTrabalhadas = 80;
        double horasExtras = 11;

        contratoTrabalho.valorHora = 75;
        contratoTrabalho.valorHoraExtra = 100;
        contratoTrabalho.funcionario = funcionario;

        double salario = minhaFolha.calcularSalario(horasTrabalhadas, horasExtras, contratoTrabalho);

        System.out.printf("O seu salário do %s mês é: R$%6.2f%n ", funcionario.nome, salario);
    }
}
