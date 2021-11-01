package lesson12;

public class Main {
    public static void main(String[] args) {
        Treugolnik treugolnik = new Treugolnik();
        try {
            treugolnik.initSides(3,5,6);
        } catch (IncorrectStoronaException e) {
            e.printStackTrace();
        }
        System.out.println("Все оk");
    }
}
