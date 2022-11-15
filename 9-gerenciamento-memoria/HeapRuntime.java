public class HeapRuntime {
    public static void main(String[] args) {
        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria(){
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();

        System.out.printf("Máxima: %s%n", emMegabytes(maxMemory));

        System.out.printf("Total empenhada: %s%n", emMegabytes(totalMemory));

        System.out.printf("Disponível: %s%n", emMegabytes(freeMemory));

        long memoriaUsada = totalMemory - freeMemory;

        System.out.printf("Memorial usada: %s%n", emMegabytes(memoriaUsada));
    }

    static String emMegabytes(long bytes){
        return  String.format("%.2fMB", bytes / 1204d / 1024d);
    }
}
