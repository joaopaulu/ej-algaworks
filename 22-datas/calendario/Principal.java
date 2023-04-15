package calendario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Calendar calendar = new GregorianCalendar(1985, Calendar.FEBRUARY, 12,10,30);
        Date data = calendar.getTime();

        System.out.println(formatador.format(data));
    }
}
