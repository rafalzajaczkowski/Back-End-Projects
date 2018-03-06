import java.util.HashMap;

/**
 * Created by jas on 2017-03-13.
 */
public class StorageTire
{
    HashMap<String, Tire> myMap = new HashMap<String, Tire>();

    Tire tire;
    int z;
    int x;
    int y;

    public void addTire(Tire tire, int z, int x, int y)
    {
        this.tire = tire;
        this.z = z;
        this.x = x;
        this.y = y;
        if (myMap.get(x+"/"+y+"/"+z) == null)
        {
            myMap.put(x + "/" + y + "/" + z, tire);
            System.out.println("Dodałem opone!");
        }
        else
        {
            System.out.println("Miejsce zajete!");
        }
    }


    public Tire getTire(int x, int y, int z)
    {
        return myMap.get(x+"/"+y+"/"+z);
    }
}
