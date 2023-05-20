package datetime.convert;

import java.time.Instant;

public class ExemploInstant {
	public static void main(String[] args) {
		Instant instante = Instant.parse("2010-08-20T10:45:20-03:00");
		System.out.println(instante);
	}
}
