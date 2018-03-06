import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double avarage = (a+b+c)/3.0;
        System.out.println(String.format("%.2f",avarage));
    }
}
