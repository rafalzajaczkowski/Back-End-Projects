import java.math.BigInteger;

public class Zad10 {
    public static void main(String[] args) {

        long a = 12147483647L;
        System.out.println(a);

     BigInteger number = new BigInteger("12147483647L");
     BigInteger second = new BigInteger("1234");
        System.out.println(number.add(second));

        System.out.println(a);
        System.out.println(number);
        System.out.println(number.add(second));
    }
}
