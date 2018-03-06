import java.util.Set;

public class LottoWeb implements Observator {

    @Override
    public void update(Set<Integer> numbers) {
        System.out.println("Na stronie internetowej wylosowano liczby lotto "+numbers);
    }
}
