package lesson5;

public class Main2 {
    public static void main(String[] args) {
        int[][] numbers = {{0, 0, 0, 0}
                         , {0, 0, 0, 0},
                           {0, 0, 0, 0},
                           {0, 0, 0, 0}};

        for (int i = 0; i <= numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i >= j) {
                    System.out.print(numbers[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();


        }
    }
}
