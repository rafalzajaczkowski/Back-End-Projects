package Zad10;

import java.util.Scanner;

public class Zad10 {

    //Napisz program, który odczytuje słowo i sprawdza czy dany String jest poprawnym
    //adresem url. Zakładamy, że adres url jest postaci http://www.wp.pl bądź postaci
    //https://www.wp.pl bądź postaci www.wp.pl

    public static void main(String[] args) {
        System.out.println("Wprowadź poprawny adres URL");
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next();

        if (url.startsWith("http://")) {
            System.out.println("Adres url jest poprawny");
        } else if (url.startsWith("https://")){
            System.out.println("Adres url jest poprawny");
        }else if(url.startsWith("www.")){
            System.out.println("Adres url jest poprawny");
        }else{
            System.out.println("Adres url NIE jest poprawny !!! ");
        }
    }
}
