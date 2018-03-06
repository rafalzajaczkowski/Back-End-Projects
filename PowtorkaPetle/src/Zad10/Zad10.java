package Zad10;

import java.io.StringWriter;
import java.util.Scanner;

public class Zad10 {

    //Napisz program który wygeneruje za pomocą (wielkość wieżyczki podaje
    //użytkownik)
    //a )wieżyczkę
    //*
    //**
    //***
    //****
    //b) choinkę
    //*
    //***
    //*****
    //*******

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        String star = "*";
        int i = 0;
        String n = star;
        for(star.equals(0);i<h;i++){
            System.out.println();

            for (star.equals(0);i<1;i++){
                System.out.print("*");
            }
        }
    }
}
