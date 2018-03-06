import java.util.Scanner;

public class Warunek6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();

       int min = a<b ? a : b;
        System.out.println(min);
//if (c<min) {
    //    System.out.println("minimum to"+c);
        // else{
       // System.out.println("minimum to "+min);
    }
}