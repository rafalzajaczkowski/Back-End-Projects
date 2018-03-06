import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(word.replace("*"," "));
    }
}
