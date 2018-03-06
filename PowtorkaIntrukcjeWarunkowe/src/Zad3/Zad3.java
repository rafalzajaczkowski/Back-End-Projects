package Zad3;

import java.util.Scanner;

public class Zad3{

   // Napisz program, który odczytuje wyraz i sprawdza czy wprowadzony wyraz to
    //Akademia.

    public static void main(String[] args) {
        System.out.println("Wpisz zy wyraz to: Akademia");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if(word.contains("Akademia")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
