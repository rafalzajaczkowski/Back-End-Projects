/**
 * Created by jas on 2017-03-13.
 */
public class Bulb
{
    int vitality =0;
    int power =0;

    public Bulb()
    {
        System.out.println("Tworze obiekt zarówka - konstuktor bezparametrowy");
    }

    public Bulb(int vitality, int power)
    {
        System.out.println("Tworze obiekt zarówka - konstruktor parametorwoy");
        this.vitality = vitality;
        this.power = power;
    }

    public void getBulbName()
    {
        if (vitality == 0 || power == 0)
        {
            System.out.println("Twoja zarowka nic nie zdziała. Ma 0 mocy i 0 zywotnosci");
        }
        else
        {
            System.out.println("Moja Bulb ma"+ vitality +"h zywotności oraz "+ power +" mocy");
        }
    }
}
