package saper;

import java.util.concurrent.ThreadLocalRandom;

public class Saper {

    private int[][] map = new int[20][20];


    public void deployBombsByLevel(int level) {
        int countBombs = 0;
        if (level == 1) {
            countBombs = 40;

        } else if (level == 2) {
            countBombs = 25;

        } else {
            countBombs = 10;

        }

        for (int i = 0; i < countBombs; i++) {
        addRandomBomb();
        }

    }
    //Рукурсия
    private void addRandomBomb() {
        int row = ThreadLocalRandom.current().nextInt(0, 20);
        int column = ThreadLocalRandom.current().nextInt(0, 20);
        if (map[row][column] != -1) {
            map[row][column] = -1;
        } else {
            this.addRandomBomb();

        }

    }

    public void printGameMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == -1) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }

    }

}
