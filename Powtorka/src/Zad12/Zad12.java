package Zad12;

import java.util.Scanner;

public class Zad12 {
    //    Zadanie 12
//    Napisz program, który odczytuje 2 zmienne całkowite i zamienia ich wartości.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("a: "+a+" b: "+b);


        int temp = a;
        a = b;
        b = temp;


        System.out.println("a: "+a+" b: "+b);

        }
}



