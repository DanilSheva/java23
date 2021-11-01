package homeWork;

import java.util.Scanner;

public class CalculFigurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фигуру");
        String figura = scanner.nextLine();

        System.out.println("Что посчитать?");
        String action = scanner.nextLine();

        if (figura.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус");
            double radius = scanner.nextDouble();
            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("периметр круга: " + (2 * Math.PI * radius));

            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("площадь круга: " + (2 * Math.PI * (radius * radius)));

            } else {
                System.out.println("это некорректное действие!");
            }


        } else if (figura.equalsIgnoreCase("эллипс")) {
            System.out.println("Большая полуось эллипса");
            double semiMajorAxis = scanner.nextDouble();
            System.out.println("Малая полуось эллипса");
            double semiMinorAxis = scanner.nextDouble();

            double firstPartOfTheFormula = Math.PI * (semiMajorAxis + semiMinorAxis);
            double secondPartOfTheFormula = Math.pow((semiMajorAxis - semiMinorAxis) / (semiMajorAxis + semiMinorAxis), 2);
            double thirdPartOfTheFormula = Math.sqrt(4 - 3 * secondPartOfTheFormula);
            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("периметр эллипса: " + firstPartOfTheFormula * (1 + (3 * secondPartOfTheFormula) / (10 + thirdPartOfTheFormula)));

            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("площадь эллипса: " + (Math.PI * (semiMajorAxis * semiMinorAxis)));

            } else {
                System.out.println("это некорректное действие!");
            }


        } else if (figura.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Длина прямоугольника");
            double lengthOfTheRectangle = scanner.nextDouble();
            System.out.println("Ширина прямоугольника");
            double widthOfTheRectangle = scanner.nextDouble();
            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("периметр прямоугольника: " + (2 * (lengthOfTheRectangle + widthOfTheRectangle)));

            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("площадь прямоугольника: " + (lengthOfTheRectangle * widthOfTheRectangle));

            } else {
                System.out.println("это некорректное действие!");
            }


        } else if (figura.equalsIgnoreCase("квадрат")) {
            System.out.println("Ширина квадрата");
            double squareWidth = scanner.nextDouble();
            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("периметр квадрата: " + (4 * squareWidth));

            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("площадь квадрата: " + (Math.pow(squareWidth, 2)));

            } else {
                System.out.println("это некорректное действие!");
            }


        } else if (figura.equalsIgnoreCase("трапеция")) {
            System.out.println("Меньшее основание трапеции");
            double shortBase = scanner.nextDouble();
            System.out.println("Большее основание трапеции");
            double longBase = scanner.nextDouble();
            System.out.println("Первая боковая сторона трапеции");
            double firstTrapezoidLegs = scanner.nextDouble();
            System.out.println("Вторая боковая сторона трапеции");
            double secondTrapezoidLegs = scanner.nextDouble();

            double firstPartOfTheFormula = ((Math.pow(firstTrapezoidLegs, 2) - Math.pow(secondTrapezoidLegs, 2)) / (longBase - shortBase)) + (longBase - shortBase);
            double secondPartOfTheFormula = Math.pow(firstPartOfTheFormula, 2);
            double thirdPartOfTheFormula = Math.sqrt(Math.pow(firstTrapezoidLegs, 2) -  (secondPartOfTheFormula / 4));
            if (action.equalsIgnoreCase("периметр")) {
                System.out.println("периметр трапеции: " + (shortBase + longBase + firstTrapezoidLegs + secondTrapezoidLegs));

            } else if (action.equalsIgnoreCase("площадь")) {
                System.out.println("площадь трапеции: " + ((shortBase + longBase) / 2) * thirdPartOfTheFormula);

            } else {
                System.out.println("это некорректное действие!");
            }


        } else {
            System.out.println("Извините такой фигуры у нас нет");
        }


    }

}
