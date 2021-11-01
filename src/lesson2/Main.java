package lesson2;

public class Main {
    public static void main(String[] args) {
        // управляющие конструкции
        int a = 8;
        int b = 6;
        int c = 8;
        //опереаторы которые дают ответ ДА или НЕТ
        // >  >= <  <=  ==  !

        // операторы которые дают математический ответ
        //   +   -   *    /    ( %(остаток от деления))
        // ++  --
        if (a==b && b==c ){
            System.out.println("Это равносторонний треугольник");
        }
        else if (a!=b&&b!=c&&c!=a){
            System.out.println("Это разносторонний треугольник");

        }else {
            System.out.println("Равнобедренный треугольник");
        }
    }
}
