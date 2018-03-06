package Zad11;

import java.util.Scanner;

public class Zad11 {

    //Odczytaj wyraz i zamień go na małe litery

    public static void main(String[] args) {
        System.out.println("Wpisz jakis wyraz dużymi literami a ja zamienię go na małe litery, ok? ;)");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word.toLowerCase());
    }
}
