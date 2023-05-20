package desafios.folhapagamento;

public class FolhaPagamento {
    double calcularSalario(double horasTrabalhadas, double horasExtras, ContratoTrabalho contratoTrabalho){
        double handlerSalario = (contratoTrabalho.valorHora * horasTrabalhadas) + (contratoTrabalho.valorHoraExtra * horasExtras);
        if(contratoTrabalho.funcionario.quantidadeFilhos >= 1){
            double adicional = (handlerSalario*100)/1000 ;
            return handlerSalario + adicional;
        }
        return handlerSalario;

    }
}
