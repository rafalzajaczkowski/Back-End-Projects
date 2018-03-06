package Zad14;

import java.util.Scanner;

public class Zad14 {

    //Odczytaj wiek osoby i sprawdź czy osoba jest pełnoletnia czy niepełnoletnia

    public static void main(String[] args) {
        System.out.println("Podaj swój wiek");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age>18)
            System.out.println("Jesteś pełnoletnią osobą");
        else {
            System.out.println("Jesteś niepełnoletnią osobą");
        }
    }
}
