package homeWorkLesson5;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                value += 5;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
