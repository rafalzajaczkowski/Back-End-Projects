package Zad5;

import java.util.Scanner;

public class Zad5 {

   // Napisz program, który odczytuje n i sumuje liczby od 1 do n

    public static void main(String[] args) {
        System.out.println("Wpisz liczbę");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=0; n>1; i++){
            System.out.println(n+1);
            break;
        }
    }
}
