package Zad9;

import java.util.Scanner;

public class Zad9 {

    //Odczytaj 2 wyrazy i sprawdź czy wprowadzone wyrazy są równe.
    //Dla wywołania:
    //Ala Ala
    //Wynikiem powinno być tak.
    //Dla wywołania:
    //Ala Sak
    //Wynikiem powinno być nie.


    public static void main(String[] args) {
        System.out.println("Wprowadź 2 wyrazy - zobaczymy czy sa dobre i mi się podobają okie dokie?");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String word2 = scanner.next();

        if (word.equals(word2)) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
    }
}
