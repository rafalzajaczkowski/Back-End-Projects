/**
 * Created by jas on 2017-03-13.
 */
public class Tire
{
    int width;
    int profil;
    int diameter;

    public Tire(int width, int profile, int diameter)
    {
        this.width = width;
        this.profil = profile;
        this.diameter = diameter;
    }

    public String getShortcut()
    {
        return width + "/" + profil + " R" + diameter;
    }
}
