package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number>5){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
