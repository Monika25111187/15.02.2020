package ZadaniaZtablicami;

import java.util.Random;

public class Tab {
    public static void main(String[] args) {
        Random rand = new Random();

        int tab[][] = new int[5][6];

        for (int i = 0; i < 5; i++) { //ewent. i<tab.lenhth
            for (int j = 0; j < 6; j++) { // ewent. j<tab[0].length
                tab[i][j] = 50 + rand.nextInt(50); // 50 + rand.nextInt(50) - losuje od 50 do 99
            }
        }
        printTab2D(tab);

        int[][] tab1 = createTab(10, 15);
        System.out.println();
        printTab2D(tab1);

    } //end main

    public static void printTab2D(int[][] tab) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createTab(int H, int W) {
        Random rand = new Random();
        int tab1[][] = new int[H][W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                tab1[i][j] = 50 + rand.nextInt(50);
            }

      }
        return tab1;
    }
}



