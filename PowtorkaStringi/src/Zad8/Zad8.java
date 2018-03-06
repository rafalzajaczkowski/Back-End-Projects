package Zad8;

import java.util.Scanner;

public class Zad8 {

    //Odczytaj wyraz i wypisz na ekran wartość true lub false w zależności od tego czy
    //wyraz zawiera w sobie napis kot.

    public static void main(String[] args) {
        System.out.println("Wpisz dowolny wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.charAt(word.length()-2));
    }
}
