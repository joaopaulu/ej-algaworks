package temporais.daysofweek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Principal1 {
    public static void main(String[] args) {
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek();

        System.out.println(diaDaSemana);

        System.out.println(DateTimeFormatter.ofPattern("EEEE")
                .withLocale(new Locale("pt", "BR"))
                .format(diaDaSemana));
    }
}
