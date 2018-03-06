package Zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog ("Burek");
        Dog dog2 = new Dog ("Ken");
        Cat cat1 = new Cat ("Filemon");
        Cat cat2 = new Cat ("Kilemon");
        List<Method> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat1);
        animals.add(cat2);

        for (Method c: animals)
        System.out.println(c.Method());
    }
}
