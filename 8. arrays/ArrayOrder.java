import java.util.Arrays;
import java.util.Comparator;

public class ArrayOrder {
    public static void main(String[] args) {
        Integer[] notas = {8, 5, 5, 3, 24, 56};

        Arrays.sort(notas, Comparator.reverseOrder());

        System.out.println(Arrays.toString(notas));
    }
}
