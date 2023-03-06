package agencia;

public class Principal2 {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Villa Selvagem", "Fortim/CE", 1600);
        Hotel hotel2 = new Hotel("Villa Selvagem", "Fortim/CE", 1500);

        System.out.println(hotel1.compareTo(hotel2));
    }
}
