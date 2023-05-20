package zone.offset;

import java.time.OffsetDateTime;

public class Principal1 {
    public static void main(String[] args) {
        OffsetDateTime dataHora = OffsetDateTime.parse("2023-09-13T20:00:00-03:00");

        System.out.println(dataHora);
        System.out.println(dataHora.getOffset());
    }
}
