package desafio;

public class Principal {
  public static void main(String[] args) {
    Televisor tv = new Televisor();

    tv.mudarVolume(20);
    tv.mudarCanal(130);

    tv.mudarVolume(300);
    tv.mudarCanal(10);
  }
}
