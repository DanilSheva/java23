package lesson1;

public class MySecondProgramm {
    public static void main(String[] args) {
        double tableLength = 2.5;
        double tableWight = 1.5;
        double roomLength = 5.0;
        double roomWight = 7.0;

        double sqTable = tableLength * tableWight;
        double sqRoom = roomLength * roomWight;

        int countTable = (int)( sqRoom / sqTable);
        System.out.println(countTable);

    }
}
