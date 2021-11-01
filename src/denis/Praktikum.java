package denis;

public class Praktikum {
    public static void main(String[] args) {
        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
        double maxExpenses = 0;
        maxExpenses = findMaxExpense(expenses);
        System.out.println("Самая большая трата недели"+maxExpenses);
    }

    private static double findMaxExpense (double[] expenses) {
        double maxExpense=0;
        for ( int i=0;i<expenses.length;i++){
            if (expenses[i]>maxExpense){
                maxExpense=expenses[i];

            }
        }
        return maxExpense;
    }
}
