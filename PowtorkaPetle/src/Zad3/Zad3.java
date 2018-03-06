package Zad3;

public class Zad3 {

    //Napisz program, który wypisuje liczby od 5 do 50, które są nieparzyste.

    public static void main(String[] args) {

        for (int i = 5; i < 50; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
