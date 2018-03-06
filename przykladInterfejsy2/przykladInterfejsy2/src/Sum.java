import java.util.List;

public class Sum {

    static int sum(List<Valuable> list){
        int score = 0;
        for (Valuable valuable:list){
            score+=valuable.getValue();
        }
        return score;
    }
}
