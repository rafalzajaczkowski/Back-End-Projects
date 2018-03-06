package zad2;

import java.util.ArrayList;
import java.util.List;

public class Calculator<T> {



    // String getFirst(List<String> list
    public T getFirst(List<T> list){
        return list.get(0);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<String> elements = new ArrayList<>();
        elements.add("pies");
        elements.add("kot");
        System.out.println(calculator.getFirst(elements));


    }

}
