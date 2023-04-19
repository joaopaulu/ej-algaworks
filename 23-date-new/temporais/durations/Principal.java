package temporais.durations;

import java.time.Duration;

public class Principal {
    public static void main(String[] args) {

        Duration duracao = Duration.parse("P1DT5H");
        System.out.println(duracao);

        Duration duracaoCalculada = duracao.dividedBy(2);
        System.out.println(duracaoCalculada);

        System.out.println(duracaoCalculada.getSeconds());

        System.out.println(duracaoCalculada.toMinutes());
        System.out.println(duracaoCalculada.toHours());

        System.out.println(duracaoCalculada.toMinutesPart());
        System.out.println(duracaoCalculada.toHoursPart());
    }

}
