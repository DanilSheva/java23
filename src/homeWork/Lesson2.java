package homeWork;

public class Lesson2 {
    public static void main(String[] args) {
        // 1. Вывести на консоль цифры в диапазоне от 20 до 0
        for (int i = 20; i >= 0; i -= 1) {
            System.out.println(i);

        }



        // 2. Вывести на консоль нечетные числа от -20 до 20
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }


        }


        // 3. Вывести на консоль цифры в диапозоне от 10 до 40 пропустив при этом интервал от 15 до 20
        for (int i = 10; i <= 40; i++) {
            if (i < 15 || i >= 20) {
                System.out.println(i);

            }


        }

        // А можно было задание 3 вот так сделать ???

        // for (int i = 10 ; i <=40 ; i++){
        //    if (i<=15){
        //      System.out.println(i);

        //   }
        //   if (i>=20){
        //        System.out.println(i);

        //  }

        // }








        //  4. Вывести на консоль сумму четных чисел от 10 до 50


        int summa = 0;

        for (int i = 10; i < 50; i += 2) {
            summa = summa + i;
        }
        System.out.println(summa);


    }

}