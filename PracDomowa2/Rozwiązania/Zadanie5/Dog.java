/**
 * Created by jas on 2017-03-13.
 */
public class Dog
{
    String name;
    int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void bark()
    {
       if (age < 5)
       {
           System.out.println("hau");
       }
       else if (age >= 5 && age <= 10)
       {
           System.out.println("grr HAU");
       }
       else if (age > 10)
       {
           System.out.println("Hauu");
       }
       else
       {
           System.out.println("Cos nie tak");
       }
    }
    public  void barkAmount(int number)
    {
        for (int i =0 ;i<=number;i++)
        {
            bark();
        }

    }
}
