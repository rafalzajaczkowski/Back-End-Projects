import java.util.ArrayList;

/**
 * Created by jas on 2017-03-13.
 */
public class Race
{
    private Auto Winner;
    private ArrayList<Auto> autos = new ArrayList<>();

    public Auto getAutoWinner()
    {
        return Winner;
    }

    public void addAuto(Auto zawodnik)
    {
        autos.add(zawodnik);
    }

    public void getNameAllAuto()
    {
        for (Auto auto : autos)
        {
          auto.getAutoName();
        }
    }
    public void  start()
    {
        Auto tmp = autos.get(0);

        for (Auto auto : autos)
        {
            if (auto.getAccelerationTime() < tmp.getAccelerationTime())
            {
                tmp = auto;
            }

        }

        Winner = tmp;
    }
}
