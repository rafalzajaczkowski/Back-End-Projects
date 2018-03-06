/**
 * Created by jas on 2017-03-13.
 */
public class RaceTest
{
    public static void main(String[] args)
    {
        Race race = new Race();

        Auto auto1 = new Auto("Opel", "Astra", 6.2);
        Auto auto2 = new Auto("Audi", "q7", 4.2);
        Auto auto3 = new Auto("Mercedes", "W211", 2.2);

        race.addAuto(auto1);
        race.addAuto(auto2);

        race.start();

        System.out.println("Wygrany to:  " + race.getAutoWinner());



        race.addAuto(auto3);

        race.start();

        System.out.println("Wygrany to:  " + race.getAutoWinner());

    }

}
