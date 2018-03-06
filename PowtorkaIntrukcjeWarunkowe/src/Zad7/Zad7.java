package Zad7;

import java.util.Scanner;

public class Zad7 {

    //Odczytaj wyraz i sprawdź czy ostatnia litera to M bądź m.

    public static void main(String[] args) {
        System.out.println("Wprowadź wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.endsWith("M")) {
            System.out.println("Wyraz kończy się na dużą literę: M");
        }else if (word.endsWith("m")){
            System.out.println("Wyraz kończy się na małą literkę: m");
        }

    }
}
