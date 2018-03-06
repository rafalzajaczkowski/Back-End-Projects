import java.util.Scanner;

public class Warunek4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();


        if (word.endsWith("a")){
            System.out.println("Imie żeńskie");
        }
        else
            System.out.println("Imie męskie");
    }
    }
