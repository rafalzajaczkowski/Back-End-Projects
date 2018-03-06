/**
 * Created by jas on 2017-03-13.
 */
public class DogTest
{
    public static void main(String[] args)
    {

        Dog dog1 = new Dog("Azor",4);
        dog1.bark();

        Dog dog2 = new Dog("Azor2",6);
        dog2.bark();


        Dog dog3 = new Dog("Azor3",10);
        dog3.bark();


        Dog dog4 = new Dog("Azor4",12);
        dog4.bark();

        dog4.barkAmount(5);
    }
}
