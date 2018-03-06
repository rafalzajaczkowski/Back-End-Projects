package Zad4;

import java.util.Scanner;

public class Zad4{

    //Napisz program, który odczytuje wyraz i sprawdza czy wprowadzone imię jest
    //męskie czy żeńskie.

    public static void main(String[] args) {
        System.out.println("Wprowadż imię");
        Scanner scanner = new Scanner(System.in);
        String word  = scanner.next();

        if (word.endsWith("a")){
            System.out.println("Imię jest żeńskie");
        }else{
            System.out.println("Imie jest męskie");
        }
    }
}
