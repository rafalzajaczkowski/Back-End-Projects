public class Zad1cz2 {
    public static void main(String[] args) {
        //Napisz metodę add wyznaczającą sumę dwóch zadanych liczb całkowitych.
        //Napisz program wykorzystujący funkcję add.

        System.out.println(sum(5, 9));
        System.out.println((substract(5, 7)));
        System.out.println((multiply(4, 9)));
        System.out.println(divide(7, 7));
        System.out.println(pitagorasRule(4, 5, 6));
        System.out.println(integer(6));
    }
    //zad1

    static int sum(int a, int b) {
        return a + b;
    }
    //zad2

    static int substract(int a, int b) {
        return a - b;
    }
    //zad3

    static int multiply(int a, int b) {
        return a * b;
    }
    //zad4

    static int divide(int a, int b) {
        return a / b;
    }
    //zad 5
    static boolean pitagorasRule(int a, int b, int c) {
        if (a * a + b * b == c * c || c * c + a * a == b * b || b * b + c * c == a * a) {
            return true;
        } else
            return false;

    }
    //zad 6
    static boolean integer(int a){
        if (a % 10 ==0){
            return true;
        }else
        return false;
    }
}