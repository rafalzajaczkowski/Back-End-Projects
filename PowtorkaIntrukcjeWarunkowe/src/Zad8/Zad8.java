package Zad8;

import java.util.Scanner;

public class Zad8 {

    //Odczytaj wprowadzony wyraz przez użytkownika i sprawdź czy pierwsza litera
    //wyrazu jest taka sama jak ostatnia. Wpisz odpowiedni komunikat.

    public static boolean main(String[] args) {
        System.out.println("Wpisz dowolny wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char firstletter = (word.charAt(0));
        char lastletter = (word.charAt(word.length()-1));

        if (firstletter == lastletter) {
            return true;
        } else{
            return false;
            }
        }
    }

