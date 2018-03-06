package Zad12;

import java.util.Scanner;

public class Zad12 {

    //​Napisz program, który sprawdza czy wprowadzony wyraz jest kodem pocztowym.
    //Kod pocztowy musi być w formacie 87-630.

    public static void main(String[] args) {
        System.out.println("Podaj poprawny kod pocztowy");
        Scanner scanner = new Scanner(System.in);
        String kodpocztowy = scanner.next();

        if (kodpocztowy.length()>6)
            System.out.println("Zły kod");
        if (kodpocztowy.length()<6)
            System.out.println("Zły kod");
        if (kodpocztowy.length()==6 && kodpocztowy.contains("-")){
            System.out.println("Poprawny kod");
        }
    }

}
