package zad2;


public class Person implements Valuable, CrudRepository<Person> {
    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public Person findFirst() {
        return null;
    }
}
