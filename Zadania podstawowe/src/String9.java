import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println(word.contains("kot"));
    }

}
