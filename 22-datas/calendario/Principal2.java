package calendario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) throws ParseException {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Data de Nascimento: ");
        String dataAniversarioTexto = scanner.nextLine();

        Date dataNascimento = formatador.parse(dataAniversarioTexto);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataNascimento);

        System.out.println(calendar.getTime());

        if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER
                && calendar.get(Calendar.DAY_OF_MONTH) == 25) {
            System.out.println("Você nasceu no Natal! Ho ho ho");
        } else if (calendar.get(Calendar.DAY_OF_YEAR) == 256) {
            System.out.println("Você nasceu no dia do programador! Hello world");
        }
    }
}
