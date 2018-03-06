import java.util.Scanner;

public class Warunek7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);

        if (firstLetter == lastLetter){
            System.out.println("Takie same");
        }else {
            System.out.println("Nie takie same");
        }

        if (lastLetter == 'm' || lastLetter == 'M'){
            System.out.println("Ostatnia to m bądź M");
        }
    }
}
