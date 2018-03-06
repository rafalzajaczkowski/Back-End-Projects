package Zad10;

import java.util.Scanner;

public class Zad10 {

    //Odczytaj wyraz i wypisz na ekranie 3 krotnie wartość wyrazu.

    public static void main(String[] args) {
        System.out.println("Wpisz dowolny wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word+" "+word+" "+word);
    }
}
