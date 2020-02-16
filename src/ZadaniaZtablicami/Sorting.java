package ZadaniaZtablicami;

import java.util.Random;

import static ZadaniaZtablicami.nieParz.printTab; //import metody printTab z klasy nieParz, jesli coś jest źle,szukaj w obu "zakładkach"

public class Sorting {

    public static final int SIZE = 900;

    public static void main(String[] args) {

       // Arrays. - metody tablicowe

        Random rand = new Random();
        int tab[] = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            tab[i] = rand.nextInt(1000000);
        }
        printTab(tab);

        long t1 = System.currentTimeMillis();
        BubbleSort(tab);
        long t2 = System.currentTimeMillis();
        printTab(tab);
        System.out.println("Czas sortowania: " + (t2 - t1) + "ms");

        long t3 = System.currentTimeMillis();
        SelectionSort(tab);
        long t4 = System.currentTimeMillis();
        printTab(tab);
        System.out.println("Czas sortowania: " + (t4 - t3) + "ms");

    }

    public static void BubbleSort(int[] tab) {
        int temp; //zmienna pomocnicza
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {//fori
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }

            }
        }
    }

    public static void SelectionSort(int[] tab) {
        int pminimalne;
        int temp;
        for (int i = 0; i < tab.length-1 ; i++) {
            pminimalne = i;
            for (int j = i +1; j < tab.length ; j++) {
                if (tab[j] < tab[pminimalne]) pminimalne =j;
            }
            temp = tab[pminimalne];
            tab[pminimalne] = tab[i];
            tab[i] = temp;
            }

        }
    }

// komentarz