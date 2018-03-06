package Zad13;

import java.util.Scanner;

public class Zad13 {

    //Wypisz true jeśli wyraz kończy się wyrazem “tka” bądź false jeśli wyraz nie kończy
    //się na wyrazie “tka”.

    public static void main(String[] args) {
        System.out.println("Wpisz dowolne słowo");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (word.endsWith("tka")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
