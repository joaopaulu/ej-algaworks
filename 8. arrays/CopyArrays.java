import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        int[] numerosJogo1 = {25, 11, 8, 46, 37, 14};
        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length);

        System.out.println(Arrays.toString(numerosJogo1));
        System.out.println(Arrays.toString(numerosJogo2));
    }
}
