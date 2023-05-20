package calendar.day;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public class Principal1 {
    public static void main(String[] args) {
        MonthDay diaMes = MonthDay.parse("--09-13");

        System.out.println(diaMes);

        LocalDate dataAniversario = Year.now().atMonthDay(diaMes);
        System.out.println(dataAniversario);
    }
}
