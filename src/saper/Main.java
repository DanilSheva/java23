package saper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Saper saper = new Saper();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите уровень сложности");
        System.out.println("1 - high");
        System.out.println("2 - medium");
        System.out.println("3 - low");


        int level = scanner.nextInt();
        saper.deployBombsByLevel(level);
        saper.printGameMap();


    }

}
