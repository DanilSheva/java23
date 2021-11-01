package lesson2;

public class Main1 {
    public static void main(String[] args) {

        int tour = 40000;
        int cash = 20000;
        int salary = 10000;
        int monthsToTrip = 5;
        int monthlyExpense=7500;


        int monthlyProfit = salary - monthlyExpense;
        int savedMoneyToTrip = monthlyProfit * monthsToTrip;

        if (cash + savedMoneyToTrip>= tour){
            System.out.println("Поедем");

        }else {
            System.out.println("не поедем");
        }

    }
}
