import java.util.Scanner;

public class Petla18 {
    public static void main(String[] args) {
        //Napisz program, który oblicza największy wspólny dzielnik dwóch liczb.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while(a!=0 && b!=0) // until either one of them is 0
        {
            int c = b;
            b = a%b;
            a = c;
        }
        System.out.println(a+b);
    }

    }

