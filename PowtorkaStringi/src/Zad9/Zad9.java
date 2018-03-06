package Zad9;

import java.util.Scanner;

public class Zad9 {

    //Odczytaj wyraz i wypisz na ekran wartość true lub false w zależności od tego czy
    //wyraz zawiera w sobie napis kot.

    public static void main(String[] args) {
        System.out.println("Wpisz dowolny wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.contains("kot")) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
