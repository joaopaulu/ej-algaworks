public class Conversao {
  public static void main(String[] args) {
    int idade = 20;
    short idadeShort = (short) idade;

    Integer diasEntrega = Integer.valueOf(30);
    short diasEntregaShort = Short.valueOf(diasEntrega.shortValue());
    Long diasEntregaLong = Long.valueOf(diasEntrega.longValue());

    Double valorTotal = Double.valueOf(1550.2);
    int valorTotalInt = valorTotal.intValue();
    System.out.println(valorTotalInt);
  }
}
