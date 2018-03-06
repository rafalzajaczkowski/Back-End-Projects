package zad2;


import java.util.ArrayList;
import java.util.List;

public class MinMax<T extends Valuable> {

    private List<T> list;

    public MinMax(List<T> list) {
        this.list = list;
    }

    public int getFirstValue(){
        return list.get(0).getValue();
    }

    public static void main(String[] args) {
        List<Employee> elements =new ArrayList<>();
        MinMax<Employee> minMax = new MinMax<>(elements);
        System.out.println(minMax.getFirstValue());

    }

}
