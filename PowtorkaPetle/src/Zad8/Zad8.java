package Zad8;

import java.util.Scanner;

public class Zad8 {

    //Napisz program, który prosi o podanie poprawnego hasła( hasło to Polska), tak
    //długo jak użytkownik nie odgadnie hasła wyświetlany jest komunikat podaj
    //poprawne hasło.

    public static void main(String[] args) {
        System.out.println("Podaj hasło");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();

       if (password == "Polska"){
           System.out.println("Hasło poprawne");
        }else{
           System.out.println("Złe hasło, podaj poprawne");

        }
    }
}


