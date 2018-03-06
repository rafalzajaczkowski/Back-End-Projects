package Zad2;

import java.util.Scanner;

public class Zad2 {

    //Napisz program, który sprawdza czy dana wprowadzona liczba jest podzielna przez
    //3.

    public static void main(String[] args) {
        System.out.println("sprawdź czy liczba jest podzielna przez 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 3 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
