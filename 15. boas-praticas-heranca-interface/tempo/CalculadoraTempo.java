package tempo;

public class CalculadoraTempo {

    public static double convertSegundosEmHoras(int segundos){
        return (double) segundos / TempoConstants.SEGUNDOS_POR_HORA;
    }

    public static double convertSegundosEmMinutos(int segundos){
        return (double) segundos / TempoConstants.SEGUNDOS_POR_MINUTO;
    }
}
