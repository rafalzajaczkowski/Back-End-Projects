package zad1;

import java.util.ArrayList;
import java.util.List;


public class Dog implements Speakable {
    @Override
    public void giveVoice() {
        System.out.println("hau hau");
    }

    public static void main(String[] args) {
        List<Speakable> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        for (Speakable animal:animals){
            animal.giveVoice();
        }
    }
}
