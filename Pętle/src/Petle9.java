import java.util.Scanner;

public class Petle9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summary = 1;


        for (int i = 1; i<=n; i++){
            summary *=i;
        }
        System.out.println(summary);
    }
}
