package Zad7;

import java.util.Scanner;

public class Zad7 {

    //Odczytaj wyraz i na ekranie wypisz Hello Nazwa Wyrazu (odzielone spacją)

    public static void main(String[] args) {

        System.out.println("Wpisz dowolny wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Hello"+" "+word);

    }
}
