import java.util.Scanner;

public class Petla13cz2 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String reverseWord = new StringBuilder(word).reverse().toString();

        if (word.equals(reverseWord)){
            System.out.println("To jest Palindrom");
        }else{
            System.out.println("To nie jest Palindrom");
        }
    }
}
