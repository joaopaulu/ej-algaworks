package megasena;

import java.util.Iterator;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

    private static final Random RANDOM = new Random();
    private int quantidadeSorteada;

    @Override
    public boolean hasNext() {
        return quantidadeSorteada < 6;
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            try {
                throw new NoSuchFieldException("Todos os números já foram sorteados");
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
        }

        quantidadeSorteada++;
        return RANDOM.nextInt(60);
    }
}
