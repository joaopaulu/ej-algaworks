package localdate;

import java.time.LocalDate;

public class Principal1 {
    public static void main(String[] args) {
        LocalDate diaDoProgramador = LocalDate.ofYearDay(2023,256);
        System.out.println(diaDoProgramador);
    }
}
