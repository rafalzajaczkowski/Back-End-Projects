import java.util.Scanner;

public class Zad4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        //1423
        //1423 = 1*10^3+2*10^2+2*1^1+3*10^0
        System.out.println("Ostatnia cyfra to "+number%10);
    }

}
