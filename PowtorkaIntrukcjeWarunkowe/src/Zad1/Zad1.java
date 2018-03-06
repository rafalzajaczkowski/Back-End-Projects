package Zad1;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        //Napisz program, który sprawdzi czy wprowadzona liczba jest większa od 5.

        System.out.println("Sprawdź czy liczba jest większa od 5");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number>5){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
