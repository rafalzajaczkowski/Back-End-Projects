package Zad12;

import java.util.Scanner;

public class Zad12 {

    // Odczytaj wyraz i zamień * pustym ciągiem.
    //Przykładowo dla ciągu znaków a*bcd ma być wypisany wyraz abcd.

    public static void main(String[] args) {
        System.out.println("Wpisz wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word.replace("*",""));
    }
}
