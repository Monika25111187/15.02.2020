package ZadaniaZtablicami;

public class Fibbonacci {
    public static void main(String[] args) {
        int n = 40;
        int wynik = Fibonacci(n);
        System.out.println("fib(n) = " + wynik);
    }
    public static int Fibonacci(int n) {

        if (n == 0 || n == 1) return n;
        return  Fibonacci(n-1) + Fibonacci(n-2); //dodawanie 2 ostatnich liczb z ciągu
    }
}


