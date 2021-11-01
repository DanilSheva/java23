package lesson12;

public class Treugolnik {

    private int a;
    private int b;
    private int c;

    public void initSides(int a, int b, int c) throws IncorrectStoronaException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IncorrectStoronaException("a <= 0 || b <= 0 || c <= 0");

        }
        if (b + c <= a) {
            throw new IncorrectStoronaException("Слишком большая сторона А!!!");

        }
        if (a + b <= c) {
            throw new IncorrectStoronaException("Слишком большая сторона C!!!");

        }
        if (a + c <= b) {
            throw new IncorrectStoronaException("Слишком большая сторона B!!!");

        }

        this.a = a;
        this.b = b;
        this.c = c;

    }


}
