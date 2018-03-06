import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int length = word.length();
        System.out.println("Przedostatnia " +word.charAt(length-2));
        System.out.println(("Pierwsza "+word.charAt(0)));
        System.out.println("Hello "+word);
    }
}
