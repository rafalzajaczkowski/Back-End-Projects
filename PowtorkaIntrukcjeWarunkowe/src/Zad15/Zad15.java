package Zad15;

import java.util.Scanner;

public class Zad15 {

    //Odczytaj 3 liczby i sprawdź czy jest możliwe otrzymanie z dwóch liczb trzeciej (jako
    //suma).

    public static void main(String[] args) {
        System.out.println("Podaj 3 liczby");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int summary = a+b;

        if (summary == c){
            System.out.println("3cia liczba daje sumę 2ch poprzednich liczb - jest zajebiście");
    }else{
            System.out.println("3cia liczba nie jest sumą 2 poprzednich liczb - upsss");
        }
    }
}
