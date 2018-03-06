package Zad5;

import java.util.Scanner;

public class Zad5 {

    //Napisz program, który odczytuje wyraz. Twoim zadaniem jest wypisanie
    //przedostatniej litery wyrazu.

    public static void main(String[] args) {
        System.out.println("Wpisz dowolny wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Przedostatnia litera to: " +word.charAt(word.length()-2));


    }

}
