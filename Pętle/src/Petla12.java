import java.util.Scanner;

public class Petla12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String src = scanner.next();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (Character.isDigit(c)) {
                System.out.println(c);
            }
        }
    }
}
