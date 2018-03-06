import java.util.Scanner;

public class Warunek11 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if(word.contains("kajak")){
            System.out.println(true);
        }else
            System.out.println(false);

    }
}
