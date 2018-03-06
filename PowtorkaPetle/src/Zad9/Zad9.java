package Zad9;

import java.io.Console;
import java.util.Scanner;

public class Zad9 {
    static long silnia (int n) {
        long wynik = 1;
        for (int i = 2; i<=n; i++) {
            wynik = wynik * i;
        }
        return wynik;
    }
    public static void main(String[] args) {
        System.out.print("Silnia z liczby 5 to: ");
        long x = silnia(5);
        System.out.print(x);
    }
}
