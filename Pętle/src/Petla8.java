import java.util.Random;
import java.util.Scanner;

public class Petla8 {
    public static void main(String[] args) {
        String correctPassword = "Polska";
        Scanner scanner = new Scanner(System.in);
        String userPassword;

       do{
           System.out.println("Podaj poprawne hasło");
           userPassword = scanner.next();
       }while (!userPassword.equals(correctPassword));
        System.out.println("Gratulacje udało się odgadnąć poprawne hasło!");
    }
}
