import java.util.Scanner;

public class Petla14 {
    public static void main(String[] args) {

        //Algorytmika

        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numberOfDivisors = 0;

                for (int i=1;i<=n;i++) {
                    if (n % i == 0)
                        numberOfDivisors++;
                }
                if (numberOfDivisors == 2){
                    System.out.println("Liczba pierwsza");
                }
                else{
                    System.out.println("Liczba złożona");
                }


    }
}

