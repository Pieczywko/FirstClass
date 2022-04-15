import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean dodajemy = true;
        boolean odejmujemy = false;

        System.out.println("Podaj 1 liczbe: ");
        int a = scan.nextInt();

        System.out.println("podaj 2 liczbe");
        int b = scan.nextInt();

        if (false) {
            System.out.println("wynik dodawania wynosi: ");
            System.out.println(a + b);
        } else {
            System.out.println("wynik odejmowania wynosi: ");
            System.out.println(a - b);
        }

    }
}
