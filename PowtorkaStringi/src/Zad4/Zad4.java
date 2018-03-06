package Zad4;

import java.util.Scanner;

public class Zad4 {

    //Napisz program, który odczytuje wyraz i wypisuje długość wyrazu.

    public static void main(String[] args) {
        System.out.println("Wprowadź wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Wprowadzony wyraz posiada ilość znaków: " +word.length());
    }

}
