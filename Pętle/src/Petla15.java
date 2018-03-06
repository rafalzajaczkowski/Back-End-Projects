import java.util.Scanner;

public class Petla15 {
    public static void main(String[] args) {
        //Napisz program, który odczytuje wyraz i wypisuje go w odwrotnej kolejności.
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuilder reverseWord = new StringBuilder(word).reverse();
        System.out.println(reverseWord);
    }
}
