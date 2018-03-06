import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz dużymi literami ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word.toLowerCase());
    }
}
