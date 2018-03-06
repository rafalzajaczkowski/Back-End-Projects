package Zad6;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {

        //Odczytaj wyraz i wypisz pierwszą literę wyrazu.

        System.out.println("Podaj nazwę a powiem Ci jaka jest jego pierwsza litera");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Pierwsza litera to: "+word.charAt(0));
    }
}
