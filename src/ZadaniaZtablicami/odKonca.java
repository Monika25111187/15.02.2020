/*package ZadaniaZtablicami;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class odKonca { //wypisuje wszystkie liczby losowe od końca

        public static final int SIZE = 10; //size określa wielkość tablicy

        public static void main(String[] args) {
            Random random =new Random();

            int tab [] = new int[SIZE];

            for (int i = 0; i< SIZE; i++) {
                tab[i] = random.nextInt(SIZE);
            }
            PrintTab(tab);//wywołanie metody w Main, można wykorzystać kilka razy
        }

        public static void PrintTab(int[] tab) {
            int i;
            for ( i = tab.length - 1; i--) //użycie .length jest bezpieczniejsze
                System.out.print(tab[i] + ", ");
        }

    public static void printReverse(int[] tab) {
        for (int i = tab.length - 1; i>=0; i--) //użycie .length jest bezpieczniejsze
            System.out.print(tab[i] + ", ");


        System.out.println();
    }

            //wersja bez przecinków
        }

 */











