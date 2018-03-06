package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj imię i nazwisko");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        System.out.println(a+" "+b);
    }
}
