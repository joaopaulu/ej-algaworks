package calendar.month;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Principal1 {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1981, Month.SEPTEMBER,13);

        Month mes = dataNascimento.getMonth();
        System.out.println(mes);

        System.out.println(DateTimeFormatter.ofPattern("MMM")
                .withLocale(new Locale("pt", "BR"))
                .format(mes));

    }
}
