package ZadaniaZtablicami;

public class Recursive {

    public static void main(String[] args) {
        int n = 20;
        int wynik = silnia(n);
        System.out.println(n + "! =" + wynik);
    }
    public static int silnia(int n) {

        if (n == 0) return 1;
        return  n * silnia(n-1);
    }
}
