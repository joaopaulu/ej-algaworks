package instant;

import java.time.Instant;

public class Principal1 {
    public static void main(String[] args) {
        Instant instante = Instant.now();
        System.out.println(instante);

        System.out.println(instante.toEpochMilli());
        System.out.println(System.currentTimeMillis());
    }
}
