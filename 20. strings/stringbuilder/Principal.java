package stringbuilder;

public class Principal {
	public static void main(String[] args) {
		long tempoInicio = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder(210_000);

		for (int i = 0; i < 200_000; i++) {
			sb.append("#");
		}

		System.out.println(sb.toString());

		double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;
		System.out.printf("Duração: %.2fs%n", duracao);
	}
}
