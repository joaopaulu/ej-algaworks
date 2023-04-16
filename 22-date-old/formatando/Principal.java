package formatando;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date hoje = new Date();

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(formatador.format(hoje));
    }
}
