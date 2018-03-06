import java.util.Scanner;

public class Warunek14 {
    public static void main(String[] args) {
        System.out.println("Podaj wiek");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age>18||age==18){
            System.out.println("Osoba jest pełnoletnia");
        }else{
            System.out.println("Osoba jest nie pełnoletnia");
        }
    }
}
