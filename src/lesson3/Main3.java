package lesson3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {





        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для хранения");
        double unputMoneu = scanner.nextDouble();

        System.out.println("Введите годовой процент");
        double unputProsent = scanner.nextDouble();

        System.out.println("На сколько лет отдаете?");
        int unputYear = scanner.nextInt();



        for (int i = 0 ; i<unputYear ; i++ ){
            for (int month = 0 ; month<12;month++){
                unputMoneu = unputMoneu + (unputMoneu/100*(unputProsent / 12));
            }

        }
        System.out.println("По истечении "+unputYear+" лет у нас будет: "+ (int) unputMoneu);

    }
}
