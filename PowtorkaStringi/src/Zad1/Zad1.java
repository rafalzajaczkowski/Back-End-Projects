package com.company;

import java.util.Scanner;

public class Zad1 {

//Odczytaj imię i nazwisko danej osoby, na ekran wypisz imię i nazwisko razem. Dla
//wprowadzonych danych: Adam Kowalski Prawidłowa odpowiedź to: Twoje imię i
//nazwisko to Adam Kowalski

    public static void main(String[] args) {
        System.out.println("Podaj imię i nazwisko");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(a+" "+b);
    }
}
