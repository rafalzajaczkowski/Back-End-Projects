package Zad11;

import java.util.Scanner;

public class Zad11 {

    //Odczytaj dane słowo sprawdź czy słowo zawiera wyraz kajak.

    public static void main(String[] args) {
        System.out.println("Podaj wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.contains("kajak")){
            System.out.println("Wprowadzone słowo zawiera 'kajak'");
        }else{
            System.out.println("Wprowadzone słowo nie zawiera 'kajak'");
        }
    }
}
