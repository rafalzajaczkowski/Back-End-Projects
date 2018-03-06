import java.util.BitSet;
import java.util.Scanner;

public class Warunek12 {
    public static void main(String[] args) {
        System.out.println("Podaj kod pocztowy");
        Scanner scanner = new Scanner(System.in);
        String zipCode = scanner.next();
        int correctLengthoOfPolishZipCode = 6;

        if (zipCode.length() != correctLengthoOfPolishZipCode) {
            System.out.println("Kod jest niepoprawny");
        } else {
            if (Character.isDigit(zipCode.charAt(0)) &&
                    Character.isDigit(zipCode.charAt(1)) &&
                    Character.isDigit(zipCode.charAt(3)) &&
                    Character.isDigit(zipCode.charAt(4)) &&
                    Character.isDigit(zipCode.charAt(5)) &&
                    zipCode.charAt(2) == '-' ){
                System.out.println("Kod jest  poprawny");
            }else{
                System.out.println("Kod jest niepoprawny");
            }
        }
    }
}
