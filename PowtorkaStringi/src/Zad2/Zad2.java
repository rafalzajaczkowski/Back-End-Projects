package Zad2;

import java.util.Scanner;

public class Zad2 {

    //Odczytaj imię i nazwisko danej osoby, na ekran wypisz imię i nazwisko razem. Dla
    //wprowadzonych danych: Adam Kowalski Prawidłowa odpowiedź to: Twoje imię i
    //nazwisko to Adam Kowalski

    public static void main(String[] args) {
        System.out.println("Wpisz dowolny wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Długość wprowadzonego wyrazu to: "+word.length());
    }
}
