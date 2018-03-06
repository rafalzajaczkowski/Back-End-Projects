package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                System.out.println("Witaj Swiecie");
            }
            System.out.println("Wyjście");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        int number;
        do {
            System.out.println("Podaj poprawną liczbę");
            number = scanner.nextInt();
        } while (number != 10);

        switch (age) {
            case 1:
                System.out.println("Masz roczek");
                break;

            case 2:
                System.out.println("Masz dwa latka");
                break;

            default:
                System.out.println("Nie znam twojego wieku");
                break;


        }
        {
            int a = 5;
            /*
            == porównanie lub równa się
            != różny
            >= <= < >
            && and czyli i
            || or , lub
            */
            boolean condition = a > -5 && a < 15;

            if (a != 5) condition = true;
            else condition = false;
            System.out.println(condition);
        }

        //Exercise nr 1
        {
            int a = 5, b = 8;
            int result = b % a; // reszta z dzielenia 8/5=1.3 - wyświetla tylko resztę czyli 3
            result++;
            //result = result +5;
            //result+=5;

            System.out.println("Wynik to " + result);

            int arithmetiCaverage = 1 + 1 + 1 / 3;
            System.out.println(arithmetiCaverage);
        }
        // Exercise nr 2
        {
            int a = 5;
            int b = 3;
            int c = 3;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

            System.out.println(a + b > c && a + c > b && b + c > a);

        }
        ///Exrcise nr 3
/* To zadanie
zostało zrobione
 */
        {
            {
                int age1 = 34;
                int age2 = 22;

                System.out.println(age1 + " " + age2);
            }

            {
                int age1 = 22;
                int age2 = 34;

                System.out.println(age1 + " " + age2);
            }
            {
                double salary = 4367.18;

                System.out.println("Twoja pensja to " + salary + "zł");
            }
        }

    }

}

