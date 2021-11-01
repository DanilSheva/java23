package homeWork;

public class Lesson1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;
        int c = 6;
        int perimiter = a + b + c;
        System.out.println("   Пириметр=" + perimiter);
        int poluperimetr = (perimiter) / 2;
        System.out.println("   Полупериметр=" + poluperimetr);
        double ploshad = Math.sqrt(poluperimetr * (poluperimetr - a) * (poluperimetr - b) * (poluperimetr - c));
        System.out.println("   Площадь треугольника=" + ploshad);
    }
}
