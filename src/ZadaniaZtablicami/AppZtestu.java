package ZadaniaZtablicami;

public class AppZtestu {
    public static void main(String[] args) {
        int wynik = 2 + 2 * 2;
        while (wynik > 0){
            if (wynik/3 ==0) {
                System.out.println('x');
                break;
            }
            System.out.println((wynik--));
        }
    }
}
