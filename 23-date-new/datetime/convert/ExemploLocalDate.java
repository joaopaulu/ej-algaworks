package datetime.convert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDate {
	public static void main(String[] args) {
		LocalDate data = LocalDate.parse("03/10/2027",
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(data);
	}
}
