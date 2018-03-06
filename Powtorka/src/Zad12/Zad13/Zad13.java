package Zad12.Zad13;

import java.util.Scanner;

public class Zad13 {
//    Napisz program, który odczytuje 3 zmienne całkowite i pokazuje na ekran średnią z
//    liczb. Zaokrąglij wynik do 2 miejsc po przecinku.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 liczby: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double n = (a+b+c)/3.0;

        System.out.println(String.format("%.2f",n));
    }
}
