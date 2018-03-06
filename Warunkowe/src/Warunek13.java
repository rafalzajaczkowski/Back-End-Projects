import java.util.Scanner;

public class Warunek13 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        if (a % 3 == 0 || a % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 3 lub 5");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3 lub 5");
        }
    }
}