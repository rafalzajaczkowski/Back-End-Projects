import java.util.Scanner;

public class Petla5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;

        for (int i=1; i<=n; i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Suma to "+sum);
        System.out.println("Suma to "+n*(n+1)/2);
        if (n % 2 == 0) {
            System.out.println("Suma to " + (n / 2) * (n + 1));
        }
        else {
            System.out.println("Suma to " + ((n +1)/2)*n);
        }
        //1+2+3+4 .....n-2+n-1+n
        //1,n   n-1,2    n-2,3
        //(n+1)*n/2
        //(n*n+1)/2
    }
}
