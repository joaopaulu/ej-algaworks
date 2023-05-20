package desafio;

import java.util.Objects;

public class Televisor {
  Integer canal = 130;
  Integer volume = 20;

  void mudarCanal(Integer novoCanal) {
    if (Objects.equals(canal, novoCanal)) {
      System.out.println("Novo canal é tambem o canal atual.");
    } else {
      canal = novoCanal;
      System.out.println("Canal alterado para " + canal);
    }
  }

  void mudarVolume(Integer novoVolume) {
    if (Objects.equals(novoVolume, volume)) {
      System.out.println("Novo volume é também o volume atual");
    }else{
      volume = (int) novoVolume.byteValue();
      System.out.println("Volume alterado para " + volume);
    }
  }
}
