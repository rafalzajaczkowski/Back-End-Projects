import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();

        if (firstWord.equals(secondWord)){
            System.out.println("tak");
        }else{
            System.out.println("nie");
        }
    }
}