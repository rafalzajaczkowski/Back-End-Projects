package Zad5;

import java.util.Scanner;

public class Zad5 {

    static class Rextester {

        //Popraw dany kod, aby wypisywał liczbę największą, a nie najmniejszą.

        public static void main(String args[]) {
            System.out.println("Podaj 2 liczby i sprawdź która ma większą wartość");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int max = a > b ? a : b;
            System.out.println(max);
        }
    }
}
