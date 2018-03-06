import java.util.Scanner;

public class Petla17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        for(int i=1; i < word.length(); i+=2){
            System.out.println(word.charAt(i));
        }
    }
}
