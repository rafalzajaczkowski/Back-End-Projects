package Zad6;

import java.util.Scanner;

public class Zad6 {

    //Napisz kod, który odczytuje 3 liczby i wypisuje na ekran najmniejszą z nich

    public static void main(String[] args) {
        System.out.println("Wpisz 3 liczby");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(Math.min(Math.min(a,b),c));
}
    }


