import java.util.Scanner;

public class Warunek10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next();


        if (url.startsWith("http://")
            || url.startsWith("https://")
            || url.startsWith("www."))
        {
            System.out.println("Poprawny adres url");
        }else{
            System.out.println("Niepoprawny adres");
        }
    }
}
