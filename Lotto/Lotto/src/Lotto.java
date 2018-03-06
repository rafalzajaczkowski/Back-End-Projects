import java.util.*;

public class Lotto {

    private List<Observator> observatorList = new ArrayList<>();


    public void random() {
        Set<Integer> integerSet = new TreeSet<>();
        Random random = new Random();


        while (integerSet.size() != 6) {
            integerSet.add(random.nextInt(49) + 1);
        }
        for (Observator observator : observatorList){
            observator.update(integerSet);
        }
    }

    public void addObservator(Observator observator){
        observatorList.add(observator);
    }
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.addObservator(new LottoTv());
        lotto.addObservator(new LottoWeb());
        lotto.random();
    }
}
