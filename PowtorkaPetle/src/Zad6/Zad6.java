package Zad6;

import java.util.Scanner;

public class Zad6 {

    //Napisz prostą grę - zadaniem użytkownika będzie zgadnięcie liczby, którą
    //zainicjujemy w programie (przykładowa liczba 600). W przypadku, gdy liczba
    //będzie za duża lub za mała, użytkownik otrzyma odpowiednią podpowiedź.
    //Gramy tak długo dopóki użytkownik zgadnie liczbę.

    public static void main(String[] args) {
        System.out.println("Zgadnij liczbę");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 600){
            System.out.println("Zgadłeś");
        }if (number>600){
            System.out.println("Liczba jest za duża");
        }if (number<600)
        System.out.println("Liczba jest za mała");
    }
}
