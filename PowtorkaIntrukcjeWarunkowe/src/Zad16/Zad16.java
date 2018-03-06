package Zad16;

import java.util.Scanner;

public class Zad16 {

    //Mówimy, że osoba jest w wieku nastolatka jeśli ma pomiędzy 13 a 18 lat.
    //Odczytaj 2 liczby oznaczające wiek dwóch osób, wypisz komunikat TAK jeśli 2
    //osoby są w wieku nastolatka oraz nie jeśli nie są w odpowiednim wieku.

    public static void main(String[] args) {
        System.out.println("Podaj swój wiek a ja sprawdzę czy jesteś nastolatkiem tj. czy Twój wiek mieści się pomiędzy 13 a 18 rokiem życia");
        Scanner scanner = new Scanner(System.in);
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();

        int ageOf2Teenagers = age1+age2;

        if (age1>=13 && age1<=18 && age2<=18 && age2<=18) {
            System.out.println("Tak");
        }else {
            System.out.println("Nie");
        }
    }
}
