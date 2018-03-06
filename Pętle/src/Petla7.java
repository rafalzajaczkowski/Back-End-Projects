import java.util.Random;

public class Petla7 {
    public static void main(String[] args) {
        System.out.println("Duży Lotek");

        Random random = new Random();

        for (int i =1; i <=6; i++){
            System.out.println("Wylosowano liczbę" + (random.nextInt(49)+1));
        }
    }
}
