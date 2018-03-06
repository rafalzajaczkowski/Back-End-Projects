import java.util.Random;
import java.util.Scanner;

public class Petle6 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(600) + 1;
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Zgadnij liczbę");
            number = scanner.nextInt();
            if (number>secretNumber)
                System.out.println("Za duża");
            if (number<secretNumber)
                System.out.println("Za mała");

        }while (number != secretNumber);
        System.out.println("Gratuluję, odgadłeś poprawną liczbę");
    }
}
