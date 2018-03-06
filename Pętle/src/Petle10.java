import java.util.Scanner;

public class Petle10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("(a:)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        StringBuilder stringBuilder = new StringBuilder("*");

        for (int i = 1; i <= n; i++) {
            System.out.println(stringBuilder);
            stringBuilder.append("*");
        }
    }
}
