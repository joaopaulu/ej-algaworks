package desafios.programaMilhas;

public class Principal {
    public static void main(String[] args) {
        Participante participante1 = new Participante("JP");
        Participante participante2 = new Participante("Chico", -10);

        System.out.println(participante1.nome);
        System.out.println(participante1.saldoDePontosInicial);

        System.out.println(participante2.nome);
        System.out.println(participante2.saldoDePontosInicial);
    }
}
