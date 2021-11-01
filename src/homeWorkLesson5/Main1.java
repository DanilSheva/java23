package homeWorkLesson5;

public class Main1 {
    public static void main(String[] args) {
        int[][] array = new int[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] += 1;
                }

                System.out.print("  " + array[i][j]);
            }
            System.out.println();
        }
    }
}
