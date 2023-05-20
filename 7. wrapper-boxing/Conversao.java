public class Conversao {
  public static void main(String[] args) {
    int idade = 20;
    short idadeShort = (short) idade;

    Integer diasEntrega = 30;
    short diasEntregaShort = diasEntrega.shortValue();
    Long diasEntregaLong = diasEntrega.longValue();

    Double valorTotal = 1550.2;
    int valorTotalInt = valorTotal.intValue();
    System.out.println(valorTotalInt);
  }
}
