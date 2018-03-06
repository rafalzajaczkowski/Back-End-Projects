package Zad13;

import java.util.Scanner;

public class Zad13 {

    //Sprawdź czy liczba wprowadzona jest podzielna przez 3 lub 5

    public static void main(String[] args) {
        System.out.println("Podaj liczbę a ja sprawdzę czy jest podzielna przez 3 czy 5");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 3 == 0)
            System.out.println("Liczba jes podzielna przez 3");
        if (number % 5 == 0)
            System.out.println("Liczba jest podzielna przez 5");
    }
    }


