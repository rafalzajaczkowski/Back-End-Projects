import java.util.Scanner;

public class Warunek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        System.out.println("Podaj hasło");
        String userPassword = scanner.next();
        boolean isTrue = true;


        if (password.equals(userPassword)) {
            System.out.println("Poprawne hasło");
        } else {
            System.out.println("Nieporpawne hasło");
        }
    }
}

