import java.util.ArrayList;
import java.util.List;

/**
 * Created by michalos on 28.02.2018.
 */
public class Rainfall implements Valuable {
    private int quantity;

    public Rainfall(int quantity) {
        this.quantity = quantity;
    }


    public static void main(String[] args) {
        List<Valuable> rainfalls = new ArrayList<>();
        rainfalls.add(new Rainfall(5));
        rainfalls.add(new Rainfall(10));
        System.out.println(Sum.sum(rainfalls));
    }

    @Override
    public int getValue() {
        return 1000*quantity;
    }
}
