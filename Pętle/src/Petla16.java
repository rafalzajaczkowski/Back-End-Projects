import java.util.Scanner;

public class Petla16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        int counter =0;

        for (int i =0; i<word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)))
                counter++;
        }
        System.out.println(counter);
        }

    }

