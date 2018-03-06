package Zad7;

import java.util.Random;

public class Zad7 {

    //Napisz program, który losuje 6 liczb z Dużego Lotka

    public static void main(String[] args) {
        Random dice = new Random();
        int number;

         for(int counter=1; counter<=6; counter++){
             number = dice.nextInt(49)+1;
             System.out.println(number + " ");
         }
    }
}

