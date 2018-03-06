import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();



        System.out.println("a "+a+" b: "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a "+a+" b: "+b);
    }
}
