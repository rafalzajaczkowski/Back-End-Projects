import java.util.Set;

public class LottoTv implements Observator {

    @Override
    public void update(Set<Integer> numbers) {
        System.out.println("Witamy w naszej telewizji:)");
        System.out.println("Wylosowaliśmy dla Ciebie liczby");
        System.out.println(numbers);
    }
}
